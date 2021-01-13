package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`

import kotlinx.serialization.json.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface InterfaceAtlasRequest {
    @GET("{type}/{region}/{endpoint}/search")
    fun find(
        @Path("endpoint") endpoint: String,
        @Path("region") region: String = "NA",
        @Path("type") type: String = "basic"
    ): Call<JsonElement>

    @GET("{type}/{region}/{endpoint}/{id}")
    fun get(
        @Path("endpoint") endpoint: String,
        @Path("id") id: String,
        @Path("region") region: String = "NA",
        @Path("type") type: String = "basic",
    ): Call<JsonElement>
}