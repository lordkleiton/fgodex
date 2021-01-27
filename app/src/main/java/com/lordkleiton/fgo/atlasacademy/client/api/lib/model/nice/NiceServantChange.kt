package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceCondTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceServantChange(
    val beforeTreasureDeviceIds: List<Int> = listOf(),
    val afterTreasureDeviceIds: List<Int> = listOf(),
    val svtId: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condType: String = FALLBACK_STRING,
    val condTargetId: Int = FALLBACK_INT,
    val condValue: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val svtVoiceId: Int = FALLBACK_INT,
    val limitCount: Int = FALLBACK_INT,
    val flag: Int = FALLBACK_INT,
    val battleSvtId: Int = FALLBACK_INT,
) {
    val condTypeEnum = findEnumByName<NiceCondTypeEnum>(condType)
}
