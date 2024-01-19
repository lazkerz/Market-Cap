package com.example.getmarketcap.presentation.view


import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.utils.ResultState
import io.realm.RealmList

interface MarketView {
    fun onMarketCapDataResult(result: ResultState<RealmList<DataItem>>)
}