package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstQuest(
    val afterActionVals: List<String> = listOf(),
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val nameRuby: String = FALLBACK_STRING,
    val type: Int = FALLBACK_INT,
    val consumeType: Int = FALLBACK_INT,
    val actConsume: Int = FALLBACK_INT,
    val chaldeaGateCategory: Int = FALLBACK_INT,
    val spotId: Int = FALLBACK_INT,
    val giftId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val bannerType: Int = FALLBACK_INT,
    val bannerId: Int = FALLBACK_INT,
    val iconId: Int = FALLBACK_INT,
    val charaIconId: Int = FALLBACK_INT,
    val giftIconId: Int = FALLBACK_INT,
    val forceOperation: Int = FALLBACK_INT,
    val afterClear: Int = FALLBACK_INT,
    val displayHours: Int = FALLBACK_INT,
    val intervalHours: Int = FALLBACK_INT,
    val chapterId: Int = FALLBACK_INT,
    val chapterSubId: Int = FALLBACK_INT,
    val chapterSubStr: String = FALLBACK_STRING,
    val recommendLv: String = FALLBACK_STRING,
    val hasStartAction: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val scriptQuestId: Int = FALLBACK_INT,
    val noticeAt: Int = FALLBACK_INT,
    val openedAt: Int = FALLBACK_INT,
    val closedAt: Int = FALLBACK_INT,
)
