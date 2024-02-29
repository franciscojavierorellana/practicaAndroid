package com.example.practicaandroid.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.databinding.ItemFacturaBinding


class FacturaViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private var binding = ItemFacturaBinding.bind(view)

    fun bind(detallesFactura: DetallesFactura){
        binding.tvDate.text = detallesFactura.fecha
        binding.tvPrecio.text = detallesFactura.importeOrdenacion
        binding.tvIsPaid.text = detallesFactura.descEstado
    }
}