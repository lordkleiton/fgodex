package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class OtherRepoInfo(
    val hash: String = FALLBACK_STRING,
    val timestamp: Int = FALLBACK_INT,
)
