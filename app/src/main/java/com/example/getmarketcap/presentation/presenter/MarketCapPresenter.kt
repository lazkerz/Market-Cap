package com.example.getmarketcap.presentation.presenter


import android.util.Log
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.CoinInfo
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.model.MarketCapResponse
import com.example.getmarketcap.model.RAW
import com.example.getmarketcap.model.RawUSD
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MarketCapPresenter(
    private val apiservice: ApiService,
    private val view: MarketView,

)  {

    fun getMarketCapData() {
        try {
            val call = apiservice.getMarketCapData(limit = 10, tsym = "USD")

            call.enqueue(object : Callback<MarketCapResponse> {
                override fun onResponse(
                    call: Call<MarketCapResponse>,
                    response: Response<MarketCapResponse>
                ) {
                    if (response.isSuccessful) {
                        val items = response.body()?.data
                        if (items != null && items.isNotEmpty()){
                            saveDataToRealm(items)
                        }
                        view.onMarketCapData(ResultState.Success(items ?: RealmList()))
                        Log.d("MarketCap", "Response: $response")
                    } else {
                        Log.e("MarketCap", "Error: ${response.message()}")
                        view.onMarketCapData(ResultState.Error(response.message()))
                    }
                }

                override fun onFailure(call: Call<MarketCapResponse>, t: Throwable) {
                    Log.e("MarketCap", "Error: ${t.message}")
                    view.onMarketCapData(ResultState.Error(t.message.toString()))
                }
            })

        } catch (e: Exception) {
            Log.e("MarketCap", "Error: ${e.message}")
            view.onMarketCapData(ResultState.Error(e.message.toString()))
        }
    }


    private fun saveDataToRealm(dataItem: RealmList<DataItem>) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realm ->
            realm.copyToRealm(dataItem)
        }
        realm.close()
    }

    fun isDataInRealm(): Boolean {
        val realm = Realm.getDefaultInstance()
        val result: RealmResults<DataItem> = realm.where(DataItem::class.java).findAll()
        val dataExists = result.isNotEmpty()
        realm.close()
        return dataExists
    }

    fun retrieveDataFromRealm() {
        val realm = Realm.getDefaultInstance()
        val result: RealmResults<DataItem> = realm.where(DataItem::class.java).findAll()

        if (result.isNotEmpty()) {
            // Data exists in Realm, you can now use it
            val items = RealmList<DataItem>().apply {
                addAll(realm.copyFromRealm(result))
            }
            view.onMarketCapData(ResultState.Success(items))
        } else {
            view.onMarketCapData(ResultState.Error("No data in Realm"))
        }

        realm.close()
    }


}