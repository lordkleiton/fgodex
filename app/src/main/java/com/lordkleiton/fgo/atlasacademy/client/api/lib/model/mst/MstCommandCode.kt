package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstCommandCode(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val sellQp: Int = FALLBACK_INT,
    val sellMana: Int = FALLBACK_INT,
    val sellRarePri: Int = FALLBACK_INT
)
