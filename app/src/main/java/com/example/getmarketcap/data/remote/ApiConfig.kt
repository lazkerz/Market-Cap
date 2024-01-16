package com.example.getmarketcap.data.remote

import android.content.Context

class ApiConfig {

    companion object {

        var API_BASE_URL = ""

        inline fun <reified T> getApiService(context: Context ): T {
            val chuckerInterceptor = ChuckerInterceptor.Builder(context)
                .collector(ChuckerCollector(context))
                .maxContentLength(250000L)
                .redactHeaders(emptySet())
                .alwaysReadResponseBody(false)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.newBuilder().client(client).build().create(T::class.java)
        }
    }
}