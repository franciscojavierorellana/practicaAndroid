package com.example.practicaandroid.data.model

import android.app.Application
import androidx.room.Room

class DetallesFacturaApp: Application() {
    val room = Room
        .databaseBuilder(this, DetallesFacturaDb::class.java, "detallesFactura")
        .build()
}