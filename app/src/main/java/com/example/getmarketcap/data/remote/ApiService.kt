package com.example.getmarketcap.data.remote


import com.example.getmarketcap.model.MarketCapResponse
import retrofit2.http.GET

interface ApiService {
        @GET("data/top/mktcapfull?limit=10&tsym=USD")
        fun getMarketCapData(): MarketCapResponse
}