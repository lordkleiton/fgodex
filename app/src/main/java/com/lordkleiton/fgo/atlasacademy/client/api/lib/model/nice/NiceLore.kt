package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceLore(
    val cv: String = FALLBACK_STRING,
    val illustrator: String = FALLBACK_STRING,
    val stats: NiceLoreStats = NiceLoreStats(),
    val costume: Map<String, NiceCostume> = mapOf(),
    val comments: List<NiceLoreComment> = listOf(),
    val voices: List<NiceVoiceGroup> = listOf(),
)
