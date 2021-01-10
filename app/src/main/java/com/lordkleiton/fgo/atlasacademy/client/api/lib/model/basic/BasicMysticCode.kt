package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherMCAsset
import kotlinx.serialization.Serializable

@Serializable
data class BasicMysticCode(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val item: OtherMCAsset
)