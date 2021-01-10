package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra

import kotlinx.serialization.Serializable

@Serializable
data class ExtraCCAssets(
    val charaGraph: ExtraAssetsUrl = ExtraAssetsUrl(),
    val faces: ExtraAssetsUrl = ExtraAssetsUrl(),
)
