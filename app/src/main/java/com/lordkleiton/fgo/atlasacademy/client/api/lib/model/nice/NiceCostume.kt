package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceCostume(
    val id: Int = FALLBACK_INT,
    val costumeCollectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val shortName: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val priority: Int = FALLBACK_INT,
)
