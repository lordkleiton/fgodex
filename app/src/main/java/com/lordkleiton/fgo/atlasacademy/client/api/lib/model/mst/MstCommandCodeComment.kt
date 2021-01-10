package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstCommandCodeComment(
    val commandCodeId: Int = FALLBACK_INT,
    val comment: String = FALLBACK_STRING,
    val illustratorId: Int = FALLBACK_INT
)
