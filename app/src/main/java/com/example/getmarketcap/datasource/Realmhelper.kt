package com.example.getmarketcap.datasource

import com.example.getmarketcap.model.CoinInfo
import com.example.getmarketcap.model.DISPLAY
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.model.MarketCapResponse
import com.example.getmarketcap.model.MetaData
import com.example.getmarketcap.model.RAW
import com.example.getmarketcap.model.RawUSD
import com.example.getmarketcap.model.Rating
import com.example.getmarketcap.model.USD
import com.example.getmarketcap.model.Weiss
import io.realm.Realm
import io.realm.RealmConfiguration

//object Realmhelper {
//    private val config =RealmConfiguration.create(
//        schema = setOf(
//            MarketCapResponse:: class,
//            DataItem::class,
//            USD::class,
//            RawUSD::class,
//            Weiss::class,
//            RAW::class,
//            MetaData::class,
//            Rating::class,
//            DISPLAY::class,
//            CoinInfo::class
//        )
//    )
//    val realm: Realm = Realm.open(config)
//}