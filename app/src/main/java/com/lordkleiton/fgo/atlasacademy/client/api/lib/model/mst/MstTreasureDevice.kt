package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstTreasureDevice(
    val individuality: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val seqId: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val rank: String = FALLBACK_STRING,
    val maxLv: Int = FALLBACK_INT,
    val typeText: String = FALLBACK_STRING,
    val attackAttri: Int = FALLBACK_INT,
)
