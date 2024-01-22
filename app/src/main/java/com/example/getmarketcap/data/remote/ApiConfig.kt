package com.example.getmarketcap.data.remote

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class ApiConfig private constructor() {

    companion object {

        private const val BASE_URL =
            "https://min-api.cryptocompare.com/"

        private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun getApiService(): ApiService {
            return retrofit.create(ApiService::class.java)
        }
    }
}