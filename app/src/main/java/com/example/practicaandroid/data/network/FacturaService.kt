package com.example.practicaandroid.data.network

import com.example.practicaandroid.core.RetrofitHelper
import com.example.practicaandroid.data.model.DetallesFactura
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FacturaService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getFacturas():List<DetallesFactura> {
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ApiFacturaClient::class.java).getFacturas()
            response.body()?.facturas ?: emptyList()        }

    }
}