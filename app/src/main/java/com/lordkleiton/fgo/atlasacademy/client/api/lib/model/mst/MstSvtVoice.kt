package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.script.ScriptJson
import kotlinx.serialization.Serializable

@Serializable
data class MstSvtVoice(
    val scriptJson: List<ScriptJson> = listOf(),
    val id: Int = FALLBACK_INT,
    val voicePrefix: Int = FALLBACK_INT,
    val type: Int = FALLBACK_INT,
)
