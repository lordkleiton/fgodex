package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstBuff(
    val vals: List<Int> = listOf(),
    val tvals: List<Int> = listOf(),
    val ckSelfIndv: List<Int> = listOf(),
    val ckOpIndv: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val buffGroup: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val detail: String = FALLBACK_STRING,
    val iconId: Int = FALLBACK_INT,
    val maxRate: Int = FALLBACK_INT,
)
