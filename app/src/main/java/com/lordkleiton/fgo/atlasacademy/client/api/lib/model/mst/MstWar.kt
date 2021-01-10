package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstWar(
    val coordinates: List<List<Int>> = listOf(),
    val id: Int = FALLBACK_INT,
    val age: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val longName: String = FALLBACK_STRING,
    val bannerId: Int = FALLBACK_INT,
    val mapImageId: Int = FALLBACK_INT,
    val mapImageW: Int = FALLBACK_INT,
    val mapImageH: Int = FALLBACK_INT,
    val headerImageId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val parentWarId: Int = FALLBACK_INT,
    val materialParentWarId: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val emptyMessage: String = FALLBACK_STRING,
    val bgmId: Int = FALLBACK_INT,
    val scriptId: String = FALLBACK_STRING,
    val startType: Int = FALLBACK_INT,
    val targetId: Int = FALLBACK_INT,
    val eventId: Int = FALLBACK_INT,
    val lastQuestId: Int = FALLBACK_INT,
    val assetId: Int = FALLBACK_INT,
)
