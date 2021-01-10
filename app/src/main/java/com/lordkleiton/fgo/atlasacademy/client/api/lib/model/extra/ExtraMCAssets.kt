package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherMCAssets
import kotlinx.serialization.Serializable

@Serializable
data class ExtraMCAssets(
    val item: OtherMCAssets,
    val masterFace: OtherMCAssets,
    val masterFigure: OtherMCAssets
)