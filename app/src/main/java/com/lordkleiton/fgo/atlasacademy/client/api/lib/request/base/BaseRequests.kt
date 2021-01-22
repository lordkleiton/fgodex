package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumExportEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.handler.ApiRequestHandler
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.FindAllDataModel
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.FindModel
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model.GetModel
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
open class BaseRequests(enumType: EnumType) {
    protected val baseFind = FindModel(enumType, EnumRegion.NA)
    protected val baseGet = GetModel(enumType, EnumRegion.NA)

    protected suspend inline fun <reified T> find(
        e: EnumEndpoint, r: EnumRegion, o: Map<String, String>,
    ) = ApiRequestHandler.find<T>(FindModel(baseFind.type, r, e, o))

    protected suspend inline fun <reified T> get(
        e: EnumEndpoint, r: EnumRegion, i: Int,
    ) = ApiRequestHandler.get<T>(GetModel(baseGet.type, r, e, i))

    protected suspend inline fun <reified T> findAll(
        e: EnumExportEndpoint,
        r: EnumRegion = EnumRegion.NA,
    ) = ApiRequestHandler.findAll<T>(FindAllDataModel(r, e))
}