package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceCondTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceSvtVoiceTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceVoiceLine(
    val name: String = FALLBACK_STRING,
    val condType: String = FALLBACK_STRING,
    val condValue: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val svtVoiceType: String = FALLBACK_STRING,
    val overwriteName: String = FALLBACK_STRING,
    val id: List<String> = listOf(),
    val audioAssets: List<String> = listOf(),
    val delay: List<Double> = listOf(),
    val face: List<Int> = listOf(),
    val form: List<Int> = listOf(),
    val text: List<String> = listOf(),
    val subtitle: String = FALLBACK_STRING,
    val conds: List<NiceVoiceCond> = listOf()
) {
    val condTypeEnum = findEnumByName<NiceCondTypeEnum>(condType)
    val svtVoiceTypeEnum = findEnumByName<NiceSvtVoiceTypeEnum>(svtVoiceType)
}
