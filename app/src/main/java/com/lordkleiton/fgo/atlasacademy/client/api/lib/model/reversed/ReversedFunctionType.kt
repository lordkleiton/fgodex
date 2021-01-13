package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed

import kotlinx.serialization.Serializable

@Serializable
data class ReversedFunctionType(
    val raw: ReversedFunction = ReversedFunction(),
)
