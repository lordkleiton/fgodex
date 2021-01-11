package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtLimitAdd(
    val individuality: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val svtId: Int = FALLBACK_INT,
    val limitCount: Int = FALLBACK_INT,
    val battleCharaId: Int = FALLBACK_INT,
    val fileConvertLimitCount: Int = FALLBACK_INT,
    val battleCharaLimitCount: Int = FALLBACK_INT,
    val battleCharaOffsetX: Int = FALLBACK_INT,
    val battleCharaOffsetY: Int = FALLBACK_INT,
    val svtVoiceId: Int = FALLBACK_INT,
    val voicePrefix: Int = FALLBACK_INT,
)
