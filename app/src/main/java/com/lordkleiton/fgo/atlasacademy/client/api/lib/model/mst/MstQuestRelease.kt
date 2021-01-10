package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class MstQuestRelease(
    val questId: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val targetId: Int = FALLBACK_INT,
    val value: Int = FALLBACK_INT,
    val openLimit: Int = FALLBACK_INT,
    val closedMessageId: Int = FALLBACK_INT,
    val imagePriority: Int = FALLBACK_INT
)
