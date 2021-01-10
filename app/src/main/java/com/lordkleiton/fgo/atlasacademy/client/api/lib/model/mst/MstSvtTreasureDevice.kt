package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtTreasureDevice(
    val damage: List<Int> = listOf(),
    val strengthStatus: Int = FALLBACK_INT,
    val svtId: Int = FALLBACK_INT,
    val num: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val imageIndex: Int = FALLBACK_INT,
    val treasureDeviceId: Int = FALLBACK_INT,
    val condQuestId: Int = FALLBACK_INT,
    val condQuestPhase: Int = FALLBACK_INT,
    val condLv: Int = FALLBACK_INT,
    val condFriendshipRank: Int = FALLBACK_INT,
    val motion: Int = FALLBACK_INT,
    val cardId: Int = FALLBACK_INT,
)
