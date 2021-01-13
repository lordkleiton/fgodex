package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.FuncApplyTargetEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceFuncTargetTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceFuncTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceBaseFunctionReverse(
    val funcId: Int = FALLBACK_INT,
    val funcType: String = FALLBACK_STRING,
    val funcTargetType: String = FALLBACK_STRING,
    val funcTargetTeam: String = FALLBACK_STRING,
    val funcPopupText: String = FALLBACK_STRING,
    val funcPopupIcon: String = FALLBACK_STRING,
    val functvals: List<NiceTrait> = listOf(),
    val funcquestTvals: List<NiceTrait> = listOf(),
    val traitVals: List<NiceTrait> = listOf(),
    val buffs: List<NiceBuff> = listOf(),
    val reverse: NiceReversedFunctionType = NiceReversedFunctionType(),
) {
    val funcTypeEnum = findEnumByName<NiceFuncTypeEnum>(funcType)
    val funcTargetTypeEnum = findEnumByName<NiceFuncTargetTypeEnum>(funcTargetType)
    val funcTargetTeamEnum = findEnumByName<FuncApplyTargetEnum>(funcTargetTeam)
}
