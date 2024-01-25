package com.example.getmarketcap.presentation.presenter


import android.util.Log
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.model.Top24Response
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

            call.enqueue(object : Callback<Top24Response> {
                override fun onResponse(
                    call: Call<Top24Response>,
                    response: Response<Top24Response>
                ) {
                    if (response.isSuccessful) {
                        val items = response.body()?.data
                        if (items != null ){
                            saveDataToRealm(items)
                        }
                        view.onMarketCapData(ResultState.Success(items ?: RealmList()))
                        Log.d("MarketCap", "Response: $response")
                    } else {
                        Log.e("MarketCap", "Error: ${response.message()}")
                        view.onMarketCapData(ResultState.Error(response.message()))
                    }
                }

                override fun onFailure(call: Call<Top24Response>, t: Throwable) {
                    Log.e("MarketCap", "Error: ${t.message}")
                    view.onMarketCapData(ResultState.Error(t.message.toString()))
                }
            })

        } catch (e: Exception) {
            Log.e("MarketCap", "Error: ${e.message}")
            view.onMarketCapData(ResultState.Error(e.message.toString()))
        }
    }
    fun saveDataToRealm(dataItem: RealmList<DataItem>) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realm ->
            realm.copyToRealm(dataItem)
        }
        realm.close()
    }


    fun retrieveDataFromRealm() {
        val realm = Realm.getDefaultInstance()
        val result = realm.where(DataItem::class.java).findAll()

        if (result.isNotEmpty()) {
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