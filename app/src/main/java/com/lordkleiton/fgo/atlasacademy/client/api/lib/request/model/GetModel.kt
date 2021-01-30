package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType

data class GetModel(
    val type: EnumType = EnumType.basic,
    val region: EnumRegion = EnumRegion.NA,
    val endpoint: EnumEndpoint = EnumEndpoint.servant,
    val id: Int = 1,
    val options: Map<String, String> = mapOf("lore" to "true"),
)
