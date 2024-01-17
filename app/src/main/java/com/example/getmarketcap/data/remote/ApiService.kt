package com.example.getmarketcap.data.remote

import com.example.getmarketcap.data.model.DataItem
import com.example.getmarketcap.data.model.MarketCapResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        @GET("data/top/mktcapfull?limit=10&tsym=USD")
        fun getMarketCapData(): MarketCapResponse
}