package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceTrait
import kotlinx.serialization.Serializable

@Serializable
data class BasicFunctionReverse(
    val funcId: Int = FALLBACK_INT,
    val funcType: String = FALLBACK_STRING,
    val funcTargetType: String = FALLBACK_STRING,
    val funcTargetTeam: String = FALLBACK_STRING,
    val functvals: List<NiceTrait> = listOf(),
    val funcquestTvals: List<NiceTrait> = listOf(),
    val traitVals: List<NiceTrait> = listOf(),
    val buffs: List<BasicBuff> = listOf(),
    val reverse: BasicReversedFunctionType = BasicReversedFunctionType()
)
