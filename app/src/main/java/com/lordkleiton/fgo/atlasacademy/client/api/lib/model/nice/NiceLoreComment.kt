package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceCondTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceLoreComment(
    val id: Int = FALLBACK_INT,
    val priority: Int = FALLBACK_INT,
    val condMessage: String = FALLBACK_STRING,
    val comment: String = FALLBACK_STRING,
    val condType: String = FALLBACK_STRING,
    val condValues: List<Int> = listOf(),
    val condValue2: Int = FALLBACK_INT,
) {
    val condTypeEnum = findEnumByName<NiceCondTypeEnum>(condType)
}
