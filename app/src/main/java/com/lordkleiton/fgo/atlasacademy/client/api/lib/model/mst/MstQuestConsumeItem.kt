package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstQuestConsumeItem(
    val itemIds: List<Int> = listOf(),
    val nums: List<Double> = listOf(),
    val questId: Int = FALLBACK_INT,
)
