package com.example.practicaandroid.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DetallesFacturaDao {
    @Query("SELECT * FROM DetallesFactura")
    suspend fun getAllFacturas(): LiveData<List<DetallesFactura>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFacturas(facturas: List<DetallesFactura>)
    @Query("DELETE FROM DetallesFactura")
    suspend fun eliminarBaseDeDatos()
}