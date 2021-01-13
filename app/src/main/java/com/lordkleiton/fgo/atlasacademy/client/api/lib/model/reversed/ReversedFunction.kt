package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.td.TdEntity
import kotlinx.serialization.Serializable

@Serializable
data class ReversedFunction(
    val skill: List<SkillEntity> = listOf(),
    val NP: List<TdEntity> = listOf(),
)
