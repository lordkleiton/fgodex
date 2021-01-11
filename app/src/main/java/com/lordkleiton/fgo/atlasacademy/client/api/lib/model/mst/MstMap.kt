package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstMap(
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val warId: Int = FALLBACK_INT,
    val mapImageId: Int = FALLBACK_INT,
    val mapImageW: Int = FALLBACK_INT,
    val mapImageH: Int = FALLBACK_INT,
    val headerImageId: Int = FALLBACK_INT,
    val bgmId: Int = FALLBACK_INT,
)
