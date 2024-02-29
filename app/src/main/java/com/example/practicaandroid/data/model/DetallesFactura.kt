package com.example.practicaandroid.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.Date

@Entity
data class DetallesFactura(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @SerializedName("descEstado") var descEstado: String,
    @SerializedName("importeOrdenacion") var importeOrdenacion: String,
    @SerializedName("fecha") var fecha: String
)