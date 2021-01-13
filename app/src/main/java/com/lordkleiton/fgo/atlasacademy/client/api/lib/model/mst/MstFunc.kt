package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.buff.BuffEntityNoReverse
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class MstFunc(
    val vals: List<Int> = listOf(),
    val expandedVals: List<BuffEntityNoReverse> = listOf(),
    val tvals: List<Int> = listOf(),
    val questTvals: List<Int> = listOf(),
    val effectList: List<Int> = listOf(),
    val popupTextColor: Int = FALLBACK_INT,
    val id: Int = FALLBACK_INT,
    val cond: Int = FALLBACK_INT,
    val funcType: Int = FALLBACK_INT,
    val targetType: Int = FALLBACK_INT,
    val applyTarget: Int = FALLBACK_INT,
    val popupIconId: Int = FALLBACK_INT,
    val popupText: String = FALLBACK_STRING,
)
