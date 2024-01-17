package com.example.getmarketcap.presentation.presenter

import com.example.getmarketcap.data.model.DataItem
import com.example.getmarketcap.data.model.MarketCapResponse
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.presentation.view.MarketView
import io.realm.Realm

class MarketCapPresenter(
    private val apiservice: ApiService,
    private val view: MarketView,
    private val model: MarketCapResponse
)  {
    fun getAllMarket(): List<DataItem>{
        val market = apiservice.getMarketCapData()
        val dataItem = market.data
        val realm = Realm.getDefaultInstance()
        realm.executeTransaction { realmInstance ->
            realmInstance.copyToRealmOrUpdate(data.map { convertToRealm(it) })
        }
        realm.close()

        view.showMarketCapData(dataItem)
    }

}