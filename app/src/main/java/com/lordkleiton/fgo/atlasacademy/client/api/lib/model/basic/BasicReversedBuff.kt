package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import kotlinx.serialization.Serializable

@Serializable
data class BasicReversedBuff(
    val function: List<BasicFunctionReverse> = listOf(),
)
