package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstStage(
    val npcDeckIds: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val questId: Int = FALLBACK_INT,
    val questPhase: Int = FALLBACK_INT,
    val wave: Int = FALLBACK_INT,
    val enemyInfo: Int = FALLBACK_INT,
    val bgmId: Int = FALLBACK_INT,
    val startEffectId: Int = FALLBACK_INT,
)
