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
                        view.onMarketCapDataResult(ResultState.Success(items ?: RealmList()))
                        Log.d("MarketCap", "Response: $response")
                    } else {
                        Log.e("MarketCap", "Error: ${response.message()}")
                        view.onMarketCapDataResult(ResultState.Error(response.message()))
                    }
                }

                override fun onFailure(call: Call<MarketCapResponse>, t: Throwable) {
                    Log.e("MarketCap", "Error: ${t.message}")
                    view.onMarketCapDataResult(ResultState.Error(t.message.toString()))
                }
            })

        } catch (e: Exception) {
            Log.e("MarketCap", "Error: ${e.message}")
            view.onMarketCapDataResult(ResultState.Error(e.message.toString()))
        }
    }

    fun saveDataToRealm(dataItem: DataItem) {
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realm ->
            realm.copyToRealmOrUpdate(dataItem)
        }
        realm.close()
    }

    fun saveDataFromRetrofit(marketCapResponse: MarketCapResponse) {
        val coinInfoName = marketCapResponse.data[0]?.coinInfo?.name
        val coinInfoFullName = marketCapResponse.data[0]?.coinInfo?.fullName
        val rawPrice = marketCapResponse.data[0]?.raw?.usd?.price
        if (!coinInfoName.isNullOrBlank()) {
            val simplifiedDataItem = DataItem().apply {
                coinInfo = CoinInfo().apply {
                    name = coinInfoName
                    fullName = coinInfoFullName ?: ""
                }
                raw = RAW().apply { // Perbaiki penulisan class RAW
                    usd = RawUSD().apply {
                        price = rawPrice ?: 0.0 // Jika rawPrice null, berikan nilai default
                    }
                }
            }
            saveDataToRealm(simplifiedDataItem)
        }
    }


}