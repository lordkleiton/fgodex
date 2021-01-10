package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstEvent(
    val script: Map<String, String> = mapOf(),
    val id: Int = FALLBACK_INT,
    val baseEventId: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val openType: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val shortName: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val noticeBannerId: Int = FALLBACK_INT,
    val bannerId: Int = FALLBACK_INT,
    val iconId: Int = FALLBACK_INT,
    val bannerPriority: Int = FALLBACK_INT,
    val openHours: Int = FALLBACK_INT,
    val intervalHours: Int = FALLBACK_INT,
    val noticeAt: Int = FALLBACK_INT,
    val startedAt: Int = FALLBACK_INT,
    val endedAt: Int = FALLBACK_INT,
    val finishedAt: Int = FALLBACK_INT,
    val materialOpenedAt: Int = FALLBACK_INT,
    val linkType: Int = FALLBACK_INT,
    val linkBody: String = FALLBACK_STRING,
    val deviceType: Int = FALLBACK_INT,
    val myroomBgId: Int = FALLBACK_INT,
    val myroomBgmId: Int = FALLBACK_INT,
    val createdAt: Int = FALLBACK_INT,
)
