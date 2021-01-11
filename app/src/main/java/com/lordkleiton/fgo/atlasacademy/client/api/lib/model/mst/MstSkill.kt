package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstSkill(
    val effectList: List<Int> = listOf(),
    val actIndividuality: List<Int> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val id: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val ruby: String = FALLBACK_STRING,
    val maxLv: Int = FALLBACK_INT,
    val iconId: Int = FALLBACK_INT,
    val motion: Int = FALLBACK_INT,
)
