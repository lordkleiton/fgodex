package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function.FunctionEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class MstTreasureDeviceLv(
    val funcId: List<Int> = listOf(),
    val expandedFuncId: List<FunctionEntityNoReverse> = listOf(),
    val svals: List<String> = listOf(),
    val svals2: List<String> = listOf(),
    val svals3: List<String> = listOf(),
    val svals4: List<String> = listOf(),
    val svals5: List<String> = listOf(),
    val treaureDeviceId: Int = FALLBACK_INT,
    val lv: Int = FALLBACK_INT,
    val gaugeCount: Int = FALLBACK_INT,
    val detailId: Int = FALLBACK_INT,
    val tdPoint: Int = FALLBACK_INT,
    val tdPointQ: Int = FALLBACK_INT,
    val tdPointA: Int = FALLBACK_INT,
    val tdPointB: Int = FALLBACK_INT,
    val tdPointEx: Int = FALLBACK_INT,
    val tdPointDef: Int = FALLBACK_INT,
    val qp: Int = FALLBACK_INT,
)
