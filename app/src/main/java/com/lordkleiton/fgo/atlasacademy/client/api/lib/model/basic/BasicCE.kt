package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class BasicCE(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val atkMax: Int = FALLBACK_INT,
    val hpMax: Int = FALLBACK_INT,
    val face: String = FALLBACK_STRING
)