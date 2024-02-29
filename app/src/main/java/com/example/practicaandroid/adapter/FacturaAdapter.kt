package com.example.practicaandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaandroid.R
import com.example.practicaandroid.data.model.DetallesFactura

class FacturaAdapter(val facturaList: MutableList<DetallesFactura>) : RecyclerView.Adapter<FacturaViewHolder>() {

    override fun onBindViewHolder(holder: FacturaViewHolder, position: Int) {
        val item = facturaList[position]
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacturaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FacturaViewHolder(layoutInflater.inflate(R.layout.item_factura, parent, false))
    }

    override fun getItemCount(): Int {
        return facturaList.size
    }
}