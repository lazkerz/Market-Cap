package com.example.getmarketcap.presentation.view


import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.utils.ResultState
import io.realm.RealmList
import io.realm.RealmResults

interface MarketView {
    fun onMarketCapData(result: ResultState<RealmList<DataItem>>)
}