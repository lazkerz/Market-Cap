package com.example.getmarketcap.presentation.view


import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.utils.ResultState

interface MarketView {
    fun onMarketCapDataResult(result: ResultState<List<DataItem>>)
}