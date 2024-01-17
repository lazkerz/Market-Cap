package com.example.getmarketcap.presentation.view

import com.example.getmarketcap.data.model.DataItem

interface MarketView {
    fun showMarketCapData(data: List<DataItem>)
    fun showError(message: String)
}