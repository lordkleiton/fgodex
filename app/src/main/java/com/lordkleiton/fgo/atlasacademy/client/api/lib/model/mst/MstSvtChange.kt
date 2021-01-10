package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtChange(
    val beforeTreasureDeviceIds: List<Int> = listOf(),
    val afterTreasureDeviceIds: List<Int> = listOf(),
    val svtId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condType: Int = FALLBACK_INT,
    val condTargetId: Int = FALLBACK_INT,
    val condValue: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val battleName: String = FALLBACK_STRING,
    val svtVoiceId: Int = FALLBACK_INT,
    val limitCount: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val battleSvtId: Int = FALLBACK_INT,
)
