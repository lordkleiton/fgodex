package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class OtherValidationError(
    val loc: List<String> = listOf(),
    val msg: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
)
