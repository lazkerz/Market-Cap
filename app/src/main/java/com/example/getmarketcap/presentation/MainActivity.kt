package com.example.getmarketcap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.getmarketcap.R
import com.example.getmarketcap.data.remote.ApiConfig
import com.example.getmarketcap.model.DataItem
import com.example.getmarketcap.model.MarketCapResponse
import com.example.getmarketcap.presentation.presenter.MarketCapPresenter
import com.example.getmarketcap.presentation.view.MarketView
import com.example.getmarketcap.utils.ResultState
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmList
import io.realm.RealmResults
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(), MarketView {

    private lateinit var presenter: MarketCapPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .name("marketcap.realm")
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(14)
            .allowWritesOnUiThread(true)
            .build()
        Realm.setDefaultConfiguration(realmConfig)

        val apiService = ApiConfig.getApiService(this)

        presenter = MarketCapPresenter(
            apiService
            , this
        )

        lifecycleScope.launch {
            presenter.getMarketCapData()
            presenter.saveDataToRealm(DataItem())
            presenter.saveDataFromRetrofit(MarketCapResponse())
            presenter.isDataInRealm()
            presenter.retrieveDataFromRealm()
        }

    }

    override fun onMarketCapData(result: ResultState<RealmList<DataItem>>) {
        when (result) {
            is ResultState.Success -> {
                // Handle data berhasil diterima
                val marketCapData = result.data
                Toast.makeText(this, "Found Market Cap Data", Toast.LENGTH_SHORT).show();

                // Lakukan sesuatu dengan data, contohnya:
                // update UI, memproses data, dsb.
            }
            is ResultState.Error -> {
                // Handle jika terjadi error
                val errorMessage = result.error
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