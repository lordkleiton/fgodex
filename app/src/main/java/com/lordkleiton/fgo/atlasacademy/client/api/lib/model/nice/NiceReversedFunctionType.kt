package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicReversedFunction
import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedFunctionType(
    val nice: NiceReversedFunction = NiceReversedFunction(),
    val basic: BasicReversedFunction = BasicReversedFunction(),
)
