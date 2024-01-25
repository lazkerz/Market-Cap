package com.example.getmarketcap.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.getmarketcap.R
import com.example.getmarketcap.model.DataItem
import io.realm.RealmList

class MarketCapAdapter(
    private val context: Context,
    private val list: RealmList<DataItem>
) : RecyclerView.Adapter<MarketCapAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvNama)
        var tvFullnama: TextView = itemView.findViewById(R.id.tvFullnama)
        var tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(
            R.layout.item_market_cap,
            parent,
            false
        )
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvName.text = item?.coinInfo?.name ?: ""
        holder.tvFullnama.text = item?.coinInfo?.fullName ?: ""
        holder.tvPrice.text = (item?.display?.usd?.price ?: "$ ").toString()
    }

    fun updateData(newList: RealmList<DataItem>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}