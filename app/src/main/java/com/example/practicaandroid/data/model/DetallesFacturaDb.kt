package com.example.practicaandroid.data.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [DetallesFactura::class],
    version = 1
)
abstract class DetallesFacturaDb : RoomDatabase() {
    abstract fun detallesFacturaDao(): DetallesFacturaDao
}