package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.extra

import kotlinx.serialization.Serializable

@Serializable
data class ExtraAssets(
    val charaGraph: ExtraAssetsUrl = ExtraAssetsUrl(),
    val faces: ExtraAssetsUrl = ExtraAssetsUrl(),
    val narrowFigure: ExtraAssetsUrl = ExtraAssetsUrl(),
    val charaFigure: ExtraAssetsUrl = ExtraAssetsUrl(),
    val charaFigureForm: Map<String, ExtraAssetsUrl> = mapOf(),
    val commands: ExtraAssetsUrl = ExtraAssetsUrl(),
    val status: ExtraAssetsUrl = ExtraAssetsUrl(),
    val equipFace: ExtraAssetsUrl = ExtraAssetsUrl(),
)
