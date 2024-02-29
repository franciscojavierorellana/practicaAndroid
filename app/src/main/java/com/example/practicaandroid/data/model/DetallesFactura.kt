package com.example.practicaandroid.data.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class DetallesFactura(
    @SerializedName("descEstado") var descEstado: String,
    @SerializedName("importeOrdenacion") var importeOrdenacion: String,
    @SerializedName("fecha") var fecha: String
)