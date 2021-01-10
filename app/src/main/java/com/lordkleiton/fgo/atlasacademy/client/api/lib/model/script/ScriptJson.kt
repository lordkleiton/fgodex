package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.script

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class ScriptJson(
    val overwriteName: String = FALLBACK_STRING,
    val infos: List<ScriptJsonInfo> = listOf(),
    val conds: List<ScriptJsonCond> = listOf(),
)
