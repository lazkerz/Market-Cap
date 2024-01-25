package com.example.getmarketcap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.getmarketcap.R
import com.example.getmarketcap.data.remote.ApiConfig
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.model.MarketCapResponse
import com.example.getmarketcap.presentation.adapter.MarketCapAdapter
import com.example.getmarketcap.presentation.presenter.MarketCapPresenter
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmList
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), MarketView {

    private lateinit var presenter: MarketCapPresenter
    private lateinit var adapter: MarketCapAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .name("marketcap.realm")
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(20)
            .allowWritesOnUiThread(true)
            .build()
        Realm.setDefaultConfiguration(realmConfig)

        val apiService = ApiConfig.getApiService(this)

        presenter = MarketCapPresenter(
            apiService
            , this
        )
        var recyclerView = findViewById<RecyclerView>(R.id.rvList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MarketCapAdapter(this, RealmList())
        recyclerView.adapter = adapter

        lifecycleScope.launch {
            presenter.getMarketCapData()
            presenter.retrieveDataFromRealm()
        }

    }

    override fun onMarketCapData(result: ResultState<RealmList<DataItem>>) {
        when (result) {
            is ResultState.Success -> {
                // Handle data berhasil diterima
                val marketCapData = result.data
                adapter.updateData(marketCapData)
                Toast.makeText(this, "Found Market Cap Data", Toast.LENGTH_SHORT).show();

                // Lakukan sesuatu dengan data, contohnya:
                // update UI, memproses data, dsb.
            }
            is ResultState.Error -> {
                // Handle jika terjadi error
                val errorMessage = result.error
                (errorMessage)
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