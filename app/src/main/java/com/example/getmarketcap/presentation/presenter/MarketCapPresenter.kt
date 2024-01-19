package com.example.getmarketcap.presentation.presenter


import android.util.Log
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.MarketCapResponse
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
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


}