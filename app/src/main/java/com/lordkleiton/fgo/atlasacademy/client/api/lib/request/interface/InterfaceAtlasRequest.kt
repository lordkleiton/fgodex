package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.`interface`

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.FIND_URL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.GET_URL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.URL_ENDPOINT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.URL_ID
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.URL_REGION
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const.Const.URL_TYPE
import kotlinx.serialization.json.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface InterfaceAtlasRequest {
    @GET(GET_URL)
    fun get(
        @Path(URL_TYPE) type: String,
        @Path(URL_REGION) region: String,
        @Path(URL_ENDPOINT) endpoint: String,
        @Path(URL_ID) id: String,
    ): Call<JsonElement>

    @GET(FIND_URL)
    fun find(
        @Path(URL_TYPE) type: String,
        @Path(URL_REGION) region: String,
        @Path(URL_ENDPOINT) endpoint: String,
        @QueryMap options: Map<String, String>,
    ): Call<JsonElement>
}