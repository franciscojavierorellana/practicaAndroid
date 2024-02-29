package com.example.practicaandroid.core

import co.infinum.retromock.BodyFactory
import co.infinum.retromock.Retromock
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream


object RetrofitHelper {
    private var urlBase: String = "https://viewnextandroid3.wiremockapi.cloud/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlBase)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getRetromock(): Retromock? {
        val retrofit: Retrofit = getRetrofit()
        return Retromock.Builder()
            .retrofit(retrofit)
            .defaultBodyFactory(ResourceBodyFactory())
            .build()
    }
}


internal class ResourceBodyFactory : BodyFactory {
    @Throws(IOException::class)
    override fun create(input: String): InputStream {
        return FileInputStream(
            ResourceBodyFactory::class.java.classLoader.getResource(input).file
        )
    }
}