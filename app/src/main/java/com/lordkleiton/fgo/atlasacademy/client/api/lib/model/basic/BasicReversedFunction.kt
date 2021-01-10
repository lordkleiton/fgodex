package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import kotlinx.serialization.Serializable

@Serializable
data class BasicReversedFunction(
    val skill: List<BasicSkillReverse> = listOf(),
    val np: List<BasicTdReverse> = listOf(),
)
