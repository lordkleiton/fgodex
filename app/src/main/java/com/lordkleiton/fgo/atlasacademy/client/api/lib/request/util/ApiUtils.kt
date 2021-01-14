package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.util

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`.InterfaceAtlasRequest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

@ExperimentalSerializationApi
object ApiUtils {
    private val contentType = Const.MEDIA_TYPE.toMediaType()
    private val converter = Json.asConverterFactory(contentType)
    private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
    val service: InterfaceAtlasRequest = Retrofit.Builder().baseUrl(Const.BASE_URL)
        .client(client).addConverterFactory(converter)
        .build().create(InterfaceAtlasRequest::class.java)
    val globalJson = Json {
        isLenient = true
        ignoreUnknownKeys = true
    }
}