package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function.FunctionEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class MstSkillLv(
    val funcId: List<Int> = listOf(),
    val expandedFuncId: List<FunctionEntityNoReverse> = listOf(),
    val svals: List<String> = listOf(),
    val script: Map<String?, String?>? = mapOf(),
    val skillId: Int = FALLBACK_INT,
    val lv: Int = FALLBACK_INT,
    val chargeTurn: Int = FALLBACK_INT,
    val skillDetailId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
)
