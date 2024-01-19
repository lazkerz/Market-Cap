package com.example.getmarketcap.presentation.presenter

import com.example.getmarketcap.data.remote.ApiConfig
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState



class MarketCapPresenter(
    private val apiservice: ApiService = ApiConfig.getApiService(),
    private val view: MarketView,
)  {



    fun getMarketCapData() {
        try {
            val response = apiservice.getMarketCapData()
            val items = response.data
            view.onMarketCapDataResult(ResultState.Success(items))
        } catch (e: Exception) {
            view.onMarketCapError(ResultState.Error(e.message.toString()))
        }
    }

}