package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtComment(
    val condValues: List<Int> = listOf(),
    val svtId: Int = FALLBACK_INT,
    val id: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condMessage: String = FALLBACK_STRING,
    val comment: String = FALLBACK_STRING,
    val condType: Int = FALLBACK_INT,
    val condValue2: Int = FALLBACK_INT,
)
