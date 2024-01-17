package com.example.getmarketcap.presentation.presenter

import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.MarketCapResponse.DataItem
import com.example.getmarketcap.model.MarketCapResponse.MarketCapResponse
import com.example.getmarketcap.presentation.view.MarketView


class MarketCapPresenter(
    private val apiservice: ApiService,
    private val view: MarketView,
    private val model: MarketCapResponse
)  {
    fun getMarketCapData(): List<DataItem>{
        val market = apiservice.getMarketCapData()
        val dataItem = market.data

        view.showMarketCapData(dataItem)
    }

}