package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherCommandCodeEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherMysticCodeEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherServantEntity
import kotlinx.serialization.Serializable

@Serializable
data class ReversedSkillTd(
    val servant: List<OtherServantEntity> = listOf(),
    val MC: List<OtherMysticCodeEntity> = listOf(),
    val CC: List<OtherCommandCodeEntity> = listOf(),
)
