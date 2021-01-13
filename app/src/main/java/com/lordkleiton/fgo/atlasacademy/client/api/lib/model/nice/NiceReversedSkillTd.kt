package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedSkillTd(
    val servant: List<NiceServant> = listOf(),
    val MC: List<NiceMysticCode> = listOf(),
    val CC: List<NiceCommandCode> = listOf(),
)
