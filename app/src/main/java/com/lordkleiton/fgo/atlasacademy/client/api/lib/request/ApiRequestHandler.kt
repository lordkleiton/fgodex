package com.lordkleiton.fgo.atlasacademy.client.api.lib.request

import android.util.Log
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`.InterfaceAtlasRequest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.BASE_URL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.MEDIA_TYPE
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.FindModel
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.GetModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.awaitResponse

@ExperimentalSerializationApi
object ApiRequestHandler {
    private val contentType = MEDIA_TYPE.toMediaType()
    private val converter = Json.asConverterFactory(contentType)
    private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
    val service: InterfaceAtlasRequest =
        Retrofit.Builder().baseUrl(BASE_URL)
            .client(client).addConverterFactory(converter)
            .build().create(InterfaceAtlasRequest::class.java)
    val json = Json {
        isLenient = true
        ignoreUnknownKeys = true
    }

    suspend inline fun <reified T> get(
        options: GetModel = GetModel(),
        service: InterfaceAtlasRequest = this.service
    ): T? {
        val call = service.get(
            options.type.name,
            options.region.name,
            options.endpoint.name,
            options.id.toString(),
        )

        return handleCall<T>(call)
    }

    suspend inline fun <reified T> find(
        options: FindModel = FindModel(),
        service: InterfaceAtlasRequest = this.service
    ): List<T>? {
        val call = service.find(
            options.type.name,
            options.region.name,
            options.endpoint.name,
            options.options,
        )

        return handleCall<List<T>>(call)
    }

    suspend inline fun <reified T> handleCall(call: Call<JsonElement>): T? =
        try {
            val res = call.awaitResponse()
            val err = res.errorBody()
            val suc = res.body()

            if (res.isSuccessful) {
                json.decodeFromJsonElement(suc!!)
            } else {
                withContext(Dispatchers.IO) {
                    @Suppress("BlockingMethodInNonBlockingContext")
                    throw Exception(err?.string())
                }
            }
        } catch (e: Exception) {
            Log.e(this.javaClass.simpleName, e.toString(), e)

            null
        }
}