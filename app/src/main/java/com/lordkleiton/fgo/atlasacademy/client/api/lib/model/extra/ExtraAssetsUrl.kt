package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra

import kotlinx.serialization.Serializable

@Serializable
data class ExtraAssetsUrl(
    val ascension: Map<String, String> = mapOf(),
    val costume: Map<String, String> = mapOf(),
    val equip: Map<String, String> = mapOf(),
    val cc: Map<String, String> = mapOf(),
)
