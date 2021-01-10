package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceSvtVoiceTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceVoiceGroup(
    val svtId: Int = FALLBACK_INT,
    val voicePrefix: Int = FALLBACK_INT,
    val type: String = FALLBACK_STRING,
    val voiceLines: List<NiceVoiceLine> = listOf(),
) {
    val typeEnum = findEnumByName<NiceSvtVoiceTypeEnum>(type)
}
