package com.example.getmarketcap.data.remote

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.getmarketcap.model.Top24Response
import io.realm.Realm
import io.realm.RealmConfiguration
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiConfig private constructor() {

    companion object {

        inline fun getApiService(context: Context ): ApiService {
            val chuckerInterceptor = ChuckerInterceptor.Builder(context)
                .collector(ChuckerCollector(context))
                .maxContentLength(250000L)
                .redactHeaders(emptySet())
                .alwaysReadResponseBody(false)
                .build()

            val BASE_URL =
                "https://min-api.cryptocompare.com/"

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val client = OkHttpClient.Builder()
                .addInterceptor(chuckerInterceptor)
                .build()

            return retrofit.newBuilder().client(client).build().create(ApiService::class.java)
        }

    }
}