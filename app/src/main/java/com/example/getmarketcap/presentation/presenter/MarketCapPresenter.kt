package com.example.getmarketcap.presentation.presenter

import com.example.getmarketcap.data.model.CoinInfo
import com.example.getmarketcap.data.model.DataItem
import com.example.getmarketcap.data.model.MarketCapResponse
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.datasource.Realmhelper
import com.example.getmarketcap.presentation.view.MarketView
import io.realm.kotlin.Realm


class MarketCapPresenter(
    private val apiservice: ApiService,
    private val view: MarketView,
    private val model: MarketCapResponse,
    private val realm: Realm
)  {

    // MutableState untuk menyimpan data dari ApiService
    private val _marketCapData = mutableStateOf<List<DataItem>>(emptyList())
    val marketCapData get() = _marketCapData.value

    // Fungsi untuk mendapatkan data dari ApiService dan menyimpannya dalam _marketCapData
    fun getMarketCapData() {
        val market = apiservice.getMarketCapData()
        _marketCapData.value = market.data
    }


    fun createMarketCapData(
        inputname: String,
        inputfullNama: String,
        inputiMAGEURL: String,
        inputmKTCAP: String
    ){
        Realmhelper.realm.writeBlocking {
            this.copyToRealm(
                CoinInfo().apply{
                    name =
                }
            )
        }

    }



}