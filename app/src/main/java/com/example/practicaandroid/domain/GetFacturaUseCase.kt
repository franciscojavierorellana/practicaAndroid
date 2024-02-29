package com.example.practicaandroid.domain

import com.example.practicaandroid.data.FacturaRepository
import com.example.practicaandroid.data.model.DetallesFactura

class GetFacturaUseCase {
    private val repository = FacturaRepository()

    suspend operator fun invoke(): List<DetallesFactura> {
        return repository.getAllFacturas()
    }
}