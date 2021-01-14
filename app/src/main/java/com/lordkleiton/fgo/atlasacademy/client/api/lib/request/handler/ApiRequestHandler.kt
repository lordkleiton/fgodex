package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.handler

import android.util.Log
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`.InterfaceAtlasRequest
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.FindModel
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.GetModel
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.util.ApiUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import retrofit2.Call
import retrofit2.awaitResponse

@ExperimentalSerializationApi
object ApiRequestHandler {
    suspend inline fun <reified T> get(
        options: GetModel,
        service: InterfaceAtlasRequest = ApiUtils.service,
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
        options: FindModel,
        service: InterfaceAtlasRequest = ApiUtils.service,
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
                ApiUtils.globalJson.decodeFromJsonElement(suc!!)
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