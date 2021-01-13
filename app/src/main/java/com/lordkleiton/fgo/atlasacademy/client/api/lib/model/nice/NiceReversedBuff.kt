package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedBuff(
    val function: List<NiceBaseFunctionReverse> = listOf(),
)
