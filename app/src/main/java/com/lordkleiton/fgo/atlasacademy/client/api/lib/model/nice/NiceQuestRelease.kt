package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceCondTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceQuestRelease(
    val type: String = FALLBACK_STRING,
    val targetId: Int = FALLBACK_INT,
    val value: Int = FALLBACK_INT,
    val closedMessage: String = FALLBACK_STRING,
) {
    val typeEnum = findEnumByName<NiceCondTypeEnum>(type)
}
