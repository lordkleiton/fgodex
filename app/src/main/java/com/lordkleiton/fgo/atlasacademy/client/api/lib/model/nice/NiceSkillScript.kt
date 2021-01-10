package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceSkillScript(
    val NP_HIGHER: List<Int> = listOf(),
    val NP_LOWER: List<Int> = listOf(),
    val STAR_HIGHER: List<Int> = listOf(),
    val STAR_LOWER: List<Int> = listOf(),
    val HP_VAL_HIGHER: List<Int> = listOf(),
    val HP_VAL_LOWER: List<Int> = listOf(),
    val HP_PER_HIGHER: List<Int> = listOf(),
    val HP_PER_LOWER: List<Int> = listOf(),
)
