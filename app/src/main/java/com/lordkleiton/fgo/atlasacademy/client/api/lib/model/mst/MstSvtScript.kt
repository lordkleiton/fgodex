package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtScript(
    val extendData: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val form: Int = FALLBACK_INT,
    val faceX: Int = FALLBACK_INT,
    val faceY: Int = FALLBACK_INT,
    val bgImageId: Int = FALLBACK_INT,
    val scale: Int = FALLBACK_INT,
    val offsetX: Int = FALLBACK_INT,
    val offsetY: Int = FALLBACK_INT,
    val offsetXMyroom: Int = FALLBACK_INT,
    val offsetYMyroom: Int = FALLBACK_INT,
)
