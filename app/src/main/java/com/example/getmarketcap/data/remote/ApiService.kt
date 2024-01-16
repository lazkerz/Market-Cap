package com.example.getmarketcap.data.remote

import com.example.getmarketcap.data.model.MarketCapResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
interface ApiService {
        @GET("data/top/mktcapfull?limit=10&tsym=USD")
        fun getAllMarket(): Call<List<MarketCapResponse>>
}