package com.example.practicaandroid.data.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [DetallesFactura::class],
    version = 1
)
abstract class DetallesFacturaDb : RoomDatabase() {
    abstract fun DetallesFacturaDao(): DetallesFacturaDao

    companion object {
        @Volatile
        private var INSTANCE: DetallesFacturaDb? = null
        fun getDatabase(context: Context): DetallesFacturaDb {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DetallesFacturaDb::class.java,
                    "item_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE =instance
                return instance
            }
        }
    }
}