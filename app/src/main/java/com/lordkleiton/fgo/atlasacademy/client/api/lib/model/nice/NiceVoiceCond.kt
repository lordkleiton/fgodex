package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceVoiceCond(
    val condType: String = FALLBACK_STRING,
    val value: Int = FALLBACK_INT,
    val valueList: List<Int> = listOf(),
    val eventId: Int = FALLBACK_INT,
)
