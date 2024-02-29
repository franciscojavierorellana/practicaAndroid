package com.example.practicaandroid.data.network

import co.infinum.retromock.meta.Mock
import co.infinum.retromock.meta.MockResponse
import com.example.practicaandroid.core.ResourceBodyFactory
import com.example.practicaandroid.data.model.DetallesFactura
import retrofit2.Response
import retrofit2.http.GET

interface ApiFacturaClient {
    @Mock
    @MockResponse(bodyFactory = ResourceBodyFactory::class, body = "factura.json")
    @GET("facturas")
    suspend fun getFacturas(): Response<List<DetallesFactura>>
}