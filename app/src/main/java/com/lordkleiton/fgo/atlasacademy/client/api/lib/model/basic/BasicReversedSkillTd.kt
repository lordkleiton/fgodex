package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import kotlinx.serialization.Serializable

@Serializable
data class BasicReversedSkillTd(
    val servant: List<BasicServant> = listOf(),
    val MC: List<BasicMysticCode> = listOf(),
    val CC: List<BasicCommandCode> = listOf(),
)
