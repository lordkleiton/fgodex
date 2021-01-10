package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import kotlinx.serialization.Serializable

@Serializable
data class OtherNpGain(
    val buster: List<Int> = listOf(),
    val arts: List<Int> = listOf(),
    val quick: List<Int> = listOf(),
    val extra: List<Int> = listOf(),
    val defence: List<Int> = listOf(),
    val np: List<Int> = listOf(),
)
