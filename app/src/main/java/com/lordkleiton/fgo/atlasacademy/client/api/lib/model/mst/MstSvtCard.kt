package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtCard(
    val normalDamage: List<Int> = listOf(),
    val singleDamage: List<Int> = listOf(),
    val trinityDamage: List<Int> = listOf(),
    val unisonDamage: List<Int> = listOf(),
    val grandDamage: List<Int> = listOf(),
    val attackIndividuality: List<Int> = listOf(),
    val svtId: Int = FALLBACK_INT,
    val cardId: Int = FALLBACK_INT,
    val motion: Int = FALLBACK_INT,
    val attackType: Int = FALLBACK_INT,
)
