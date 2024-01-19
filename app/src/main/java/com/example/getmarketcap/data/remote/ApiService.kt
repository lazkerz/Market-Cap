package com.example.getmarketcap.data.remote


import com.example.getmarketcap.model.MarketCapResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
        @GET("data/top/mktcapfull")
        fun getMarketCapData(
                @Query("limit") limit: Int,
                @Query("tsym") tsym: String
        ): Call<MarketCapResponse>
}