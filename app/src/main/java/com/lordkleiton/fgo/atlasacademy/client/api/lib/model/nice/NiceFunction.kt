package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.schema.SchemaVals
import kotlinx.serialization.Serializable

@Serializable
data class NiceFunction(
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
    val svals: List<SchemaVals> = listOf(),
    val svals2: List<SchemaVals> = listOf(),
    val svals3: List<SchemaVals> = listOf(),
    val svals4: List<SchemaVals> = listOf(),
    val svals5: List<SchemaVals> = listOf(),
    val followerVals: List<SchemaVals> = listOf(),
)
