package com.example.getmarketcap.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.getmarketcap.R
import com.example.getmarketcap.model.DataItem
import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmResults
import kotlinx.coroutines.NonDisposableHandle.parent

//class MarketCapAdapter(
//    private val context: Context,
//    private val onMarketCapData: RealmResults<DataItem>
//) : RecyclerView.Adapter<MarketCapAdapter.ViewHolder>() {
//
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        var tvName: TextView = itemView.findViewById(R.id.tvNama)
//        var tvFullnama: TextView = itemView.findViewById(R.id.tvFullnama)
//        var tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemView = LayoutInflater.from(context).inflate(
//            R.layout.item_market_cap,
//            parent,
//            false
//        )
//        return ViewHolder(itemView)
//    }
//
//    override fun getItemCount(): Int {
//        return onMarketCapData.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val onMarketCapData = onMarketCapData[position]
//
//        holder.tvName.text = onMarketCapData?.coinInfo?.name ?: ""
//        holder.tvFullnama.text = onMarketCapData?.coinInfo?.fullName ?: ""
//        holder.tvPrice.text = (onMarketCapData?.raw?.usd?.price ?: "").toString()
//    }
//}

//class UserAdapter(context: Context, private val layoutResId: Int, private var recyclerView: RecyclerView) :
//    Adapter<RealmResults<DataItem>>(context, layoutResId, recyclerView) {
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val view = convertView?: LayoutInflater.from(context).inflate(layoutResId, parent, false)
//
//        val user = recyclerView[position]
//
//        view.findViewById<TextView>(R.id.tvFullnama).text = user.fullName.toString()
//        view.findViewById<TextView>(R.id.tvNama).text = user.name
//        view.findViewById<TextView>(R.id.tvPrice).text = user.price.toString()
//
//        return view
//    }
//}