package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.model

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumExportEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion

@Suppress("SpellCheckingInspection")
data class FindAllDataModel(
    val region: EnumRegion,
    val endpoint: EnumExportEndpoint,
)