package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.ascension

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceTrait
import kotlinx.serialization.Serializable

@Serializable
data class AscensionAddEntryNiceTrait(
    val ascension: Map<String, List<NiceTrait>> = mapOf(),
    val costume: Map<String, List<NiceTrait>> = mapOf(),
)
