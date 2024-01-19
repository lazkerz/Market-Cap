package com.example.getmarketcap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getmarketcap.R
import com.example.getmarketcap.data.remote.ApiConfig
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.presentation.presenter.MarketCapPresenter
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
import io.realm.RealmList

class MainActivity : AppCompatActivity(), MarketView {

    private lateinit var presenter: MarketCapPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = ApiConfig.getApiService()
        presenter = MarketCapPresenter(
            apiService,
            this
        )

        presenter.getMarketCapData()
    }
    override fun onMarketCapDataResult(result: ResultState<RealmList<DataItem>>) {
        when (result) {
            is ResultState.Success -> {
                // Handle data berhasil diterima
                val marketCapData = result.data
                if (marketCapData.isNotEmpty()) {
                    log("Anda mendapatkan data marketnya")
                    // Lakukan sesuatu dengan data, contohnya:
                    // update UI, memproses data, dsb.
                } else {
                    log("Data kosong.")
                    // Lakukan sesuatu saat data kosong
                }

                // Lakukan sesuatu dengan data, contohnya:
                // update UI, memproses data, dsb.
            }
            is ResultState.Error -> {
                // Handle jika terjadi error
                val errorMessage = result.error
                log("Error: $errorMessage")
                // Lakukan sesuatu dengan pesan error, contohnya:
                // tampilkan pesan error kepada pengguna
            }
            is ResultState.Loading -> {
                // Handle loading state
                log("Loading...")
                // Lakukan sesuatu saat data sedang di-load, contohnya:
                // tampilkan indikator loading
            }
        }
    }

    private fun log(message: String) {
        // Metode log Anda untuk menampilkan pesan pada LogCat
        // Anda dapat menggunakan Log.d("TAG", message) atau metode log lainnya
        // Sesuaikan dengan kebutuhan aplikasi Anda
        // Misalnya: Log.d("MainActivity", message)
        println(message)
    }

}