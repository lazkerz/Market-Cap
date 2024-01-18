package com.example.getmarketcap.datasource

import com.example.getmarketcap.data.model.CoinInfo
import com.example.getmarketcap.data.model.DISPLAY
import com.example.getmarketcap.data.model.DataItem
import com.example.getmarketcap.data.model.MarketCapResponse
import com.example.getmarketcap.data.model.MetaData
import com.example.getmarketcap.data.model.RAW
import com.example.getmarketcap.data.model.Rating
import com.example.getmarketcap.data.model.USD
import com.example.getmarketcap.data.model.Weiss
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

object Realmhelper {
    private val config =RealmConfiguration.create(
        schema = setOf(
            MarketCapResponse::class,
            DataItem::class,
            USD::class,
            Weiss::class,
            RAW::class,
            MetaData::class,
            Rating::class,
            DISPLAY::class,
            CoinInfo::class
        )
    )
    val realm: Realm = Realm.open(config)
}