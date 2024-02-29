package com.example.practicaandroid.data.model

import com.example.practicaandroid.data.model.DetallesFactura
import com.google.gson.annotations.SerializedName

data class Factura(
    @SerializedName("numFacturas") var numFacturas: Int,
    @SerializedName("facturas") var facturas: List<DetallesFactura>
)