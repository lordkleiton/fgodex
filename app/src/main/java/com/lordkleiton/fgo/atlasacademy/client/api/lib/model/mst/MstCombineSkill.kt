package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstCombineSkill(
    val itemIds: List<Int> = listOf(),
    val itemNums: List<Int> = listOf(),
    val svtId: Int = FALLBACK_INT,
    val costumeId: Int = FALLBACK_INT,
    val qp: Int = FALLBACK_INT,
)