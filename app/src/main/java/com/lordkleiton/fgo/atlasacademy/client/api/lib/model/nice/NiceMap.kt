package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceMap(
    val id: Int = FALLBACK_INT,
    val mapImage: String = FALLBACK_STRING,
    val mapImageW: Int = FALLBACK_INT,
    val mapImageH: Int = FALLBACK_INT,
    val headerImage: String = FALLBACK_STRING,
    val bgm: NiceBgm
)
