package com.example.getmarketcap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.getmarketcap.R
import com.example.getmarketcap.data.remote.ApiConfig
import com.example.getmarketcap.data.remote.ApiService
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.presentation.presenter.MarketCapPresenter
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
import io.realm.RealmList
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), MarketView {

    private lateinit var presenter: MarketCapPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = ApiConfig.getApiService(this)

        // Inisialisasi presenter dengan coroutine
        presenter = MarketCapPresenter(apiService, this)

        // Jalankan coroutine untuk memanggil fungsi suspend
        lifecycleScope.launch {
            presenter.getMarketCapData()
        }

    }

    override fun onMarketCapDataResult(result: ResultState<RealmList<DataItem>>) {
        when (result) {
            is ResultState.Success -> {
                // Handle data berhasil diterima
//                val marketCapData = result.data
                Toast.makeText(this, "Found Market Cap Data", Toast.LENGTH_SHORT).show();

                // Lakukan sesuatu dengan data, contohnya:
                // update UI, memproses data, dsb.
            }
            is ResultState.Error -> {
                // Handle jika terjadi error
//                val errorMessage = result.error
                Toast.makeText(this, "data not found", Toast.LENGTH_SHORT).show();
                // Lakukan sesuatu dengan pesan error, contohnya:
                // tampilkan pesan error kepada pengguna
            }
            is ResultState.Loading -> {
                // Handle loading state
                Toast.makeText(this, "Loading..", Toast.LENGTH_SHORT).show();
                // Lakukan sesuatu saat data sedang di-load, contohnya:
                // tampilkan indikator loading
            }
        }
    }

}