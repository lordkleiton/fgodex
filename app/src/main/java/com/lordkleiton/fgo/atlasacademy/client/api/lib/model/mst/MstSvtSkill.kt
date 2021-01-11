package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtSkill(
    val strengthStatus: Int = FALLBACK_INT,
    val svtId: Int = FALLBACK_INT,
    val num: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val skillId: Int = FALLBACK_INT,
    val condQuestId: Int = FALLBACK_INT,
    val condQuestPhase: Int = FALLBACK_INT,
    val condLv: Int = FALLBACK_INT,
    val condLimitCount: Int = FALLBACK_INT,
    val eventId: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
)
