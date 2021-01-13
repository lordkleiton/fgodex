package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import kotlinx.serialization.Serializable

@Serializable
data class OtherServantScript(
    val SkillRankUp: Map<String, List<Int>> = mapOf(),
)
