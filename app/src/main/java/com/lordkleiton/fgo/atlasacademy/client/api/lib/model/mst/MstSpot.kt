package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSpot(
    val joinSpotIds: List<Int> = listOf(),
    val id: Int = FALLBACK_INT,
    val warId: Int = FALLBACK_INT,
    val mapId: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val imageId: Int = FALLBACK_INT,
    val x: Int = FALLBACK_INT,
    val y: Int = FALLBACK_INT,
    val imageOfsX: Int = FALLBACK_INT,
    val imageOfsY: Int = FALLBACK_INT,
    val nameOfsX: Int = FALLBACK_INT,
    val nameOfsY: Int = FALLBACK_INT,
    val questOfsX: Int = FALLBACK_INT,
    val questOfsY: Int = FALLBACK_INT,
    val nextOfsX: Int = FALLBACK_INT,
    val nextOfsY: Int = FALLBACK_INT,
    val dispCondType1: Int = FALLBACK_INT,
    val dispTargetId1: Int = FALLBACK_INT,
    val dispTargetValue1: Int = FALLBACK_INT,
    val dispCondType2: Int = FALLBACK_INT,
    val dispTargetId2: Int = FALLBACK_INT,
    val dispTargetValue2: Int = FALLBACK_INT,
    val activeCondType: Int = FALLBACK_INT,
    val activeTargetId: Int = FALLBACK_INT,
    val activeTargetValue: Int = FALLBACK_INT,
    val closedMessage: String = FALLBACK_STRING,
    val flag: Int = FALLBACK_INT,
)
