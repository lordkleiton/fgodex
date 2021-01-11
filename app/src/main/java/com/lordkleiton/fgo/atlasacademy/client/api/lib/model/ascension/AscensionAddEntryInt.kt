package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.ascension

import kotlinx.serialization.Serializable

@Serializable
data class AscensionAddEntryInt(
    val ascension: Map<String, Int> = mapOf(),
    val costume: Map<String, Int> = mapOf(),
)
