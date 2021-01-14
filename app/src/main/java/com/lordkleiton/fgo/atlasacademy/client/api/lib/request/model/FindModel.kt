package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType


@Suppress("SpellCheckingInspection")
data class FindModel(
    val type: EnumType = EnumType.basic,
    val region: EnumRegion = EnumRegion.NA,
    val endpoint: EnumEndpoint = EnumEndpoint.servant,
    val options: Map<String, String> = mapOf("name" to "altria"),
)
