package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.script

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class ScriptJsonInfo(
    val id: String = FALLBACK_STRING,
    val face: Int = FALLBACK_INT,
    val delay: Int = FALLBACK_INT,
    val text: String = FALLBACK_STRING,
    val form: Int = FALLBACK_INT,
    val changeEffect: Int = FALLBACK_INT,
)
