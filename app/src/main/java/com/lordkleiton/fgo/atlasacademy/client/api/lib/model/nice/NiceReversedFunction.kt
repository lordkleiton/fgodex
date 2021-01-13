package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedFunction(
    val skill: List<NiceSkillReverse> = listOf(),
    val NP: List<NiceTdReverse> = listOf(),
)
