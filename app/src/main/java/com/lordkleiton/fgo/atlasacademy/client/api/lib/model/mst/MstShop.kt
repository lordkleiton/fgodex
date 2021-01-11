package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstShop(
    val itemIds: List<Int> = listOf(),
    val prices: List<Int> = listOf(),
    val targetIds: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val baseShopId: Int = FALLBACK_INT,
    val eventId: Int = FALLBACK_INT,
    val slot: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val purchaseType: Int = FALLBACK_INT,
    val setNum: Int = FALLBACK_INT,
    val payType: Int = FALLBACK_INT,
    val shopType: Int = FALLBACK_INT,
    val limitNum: Int = FALLBACK_INT,
    val defaultLv: Int = FALLBACK_INT,
    val defaultLimitCount: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val infoMessage: String = FALLBACK_STRING,
    val warningMessage: String = FALLBACK_STRING,
    val imageId: Int = FALLBACK_INT,
    val bgImageId: Int = FALLBACK_INT,
    val openedAt: Int = FALLBACK_INT,
    val closedAt: Int = FALLBACK_INT,
)
