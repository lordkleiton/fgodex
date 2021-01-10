package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class OtherGlobalNewMstSubtitle(
    val id: String = FALLBACK_STRING,
    val serif: String = FALLBACK_STRING
)
