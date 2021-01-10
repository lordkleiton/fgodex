package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.script

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import kotlinx.serialization.Serializable

@Serializable
data class ScriptJsonCond(
    val condType: Int = FALLBACK_INT,
    val value: Int = FALLBACK_INT,
    val eventId: Int = FALLBACK_INT,
)
