package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceServantScript(
    val SkillRankUp: Map<String, Int> = mapOf(),
)
