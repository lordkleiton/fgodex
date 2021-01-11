package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_BOOL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstQuestPhase(
    val classIds: List<Int> = listOf(),
    val individuality: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val questId: Int = FALLBACK_INT,
    val phase: Int = FALLBACK_INT,
    val isNpcOnly: Boolean? = FALLBACK_BOOL,
    val battleBgId: Int = FALLBACK_INT,
    val battleBgType: Int = FALLBACK_INT,
    val qp: Int = FALLBACK_INT,
    val playerExp: Int = FALLBACK_INT,
    val friendshipExp: Int = FALLBACK_INT,
    val giftId: Int = FALLBACK_INT,
)
