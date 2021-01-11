package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_BOOL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstItem(
    val individuality: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val eventId: Int = FALLBACK_INT,
    val eventGroupId: Int = FALLBACK_INT,
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val imageId: Int = FALLBACK_INT,
    val bgImageId: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val unit: String = FALLBACK_STRING,
    val value: Int = FALLBACK_INT,
    val sellQp: Int = FALLBACK_INT,
    val isSell: Boolean? = FALLBACK_BOOL,
    val priority: Int = FALLBACK_INT,
    val dropPriority: Int = FALLBACK_INT,
    val startedAt: Int = FALLBACK_INT,
    val endedAt: Int = FALLBACK_INT,
)
