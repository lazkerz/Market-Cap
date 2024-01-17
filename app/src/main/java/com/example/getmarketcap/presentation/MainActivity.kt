package com.example.getmarketcap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getmarketcap.R
import com.example.getmarketcap.data.model.DataItem
import com.example.getmarketcap.presentation.contract.MarketCapContract
import com.example.getmarketcap.presentation.model.MarketCapModel
import com.example.getmarketcap.presentation.presenter.MarketCapPresenter

class MainActivity : AppCompatActivity(), MarketCapContract.View {

    private lateinit var presenter: MarketCapContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model: MarketCapContract.Model = MarketCapModel()
        presenter = MarketCapPresenter(this, model)

        // Panggil method pada presenter untuk mendapatkan data
        presenter.getMarketCapData()
    }

    override fun showMarketCapData(data: List<DataItem>) {
        // Tampilkan data di UI, contohnya bisa menggunakan RecyclerView atau cara lainnya
        // ...
    }

    override fun showError(message: String) {
        // Tampilkan pesan kesalahan di UI, misalnya menggunakan Toast
        // ...
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}