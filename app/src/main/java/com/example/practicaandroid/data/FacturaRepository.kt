package com.example.practicaandroid.data

import com.example.practicaandroid.data.model.DetallesFactura
import com.example.practicaandroid.data.network.FacturaService

class FacturaRepository {
    private val api = FacturaService()

    suspend fun getAllFacturas(): List<DetallesFactura> {
        return api.getFacturas()
    }
}