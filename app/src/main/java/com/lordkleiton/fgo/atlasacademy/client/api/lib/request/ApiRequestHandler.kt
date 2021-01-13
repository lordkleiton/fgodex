package com.lordkleiton.fgo.atlasacademy.client.api.lib.request

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`.InterfaceAtlasRequest
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.awaitResponse

@ExperimentalSerializationApi
object ApiRequestHandler {
    private val contentType = "application/json".toMediaType()
    val service: InterfaceAtlasRequest =
        Retrofit.Builder().baseUrl("https://api.atlasacademy.io/")
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build().create(InterfaceAtlasRequest::class.java)

    suspend inline fun <reified T> get(service: InterfaceAtlasRequest = this.service): T? {
        val res = service.get("servant", "1", type = "nice").awaitResponse()

        return Json {
            isLenient = true
            ignoreUnknownKeys = true
        }.decodeFromJsonElement<T>(res.body()!!)
    }
}