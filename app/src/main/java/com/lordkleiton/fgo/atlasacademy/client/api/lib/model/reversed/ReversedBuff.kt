package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function.FunctionEntity
import kotlinx.serialization.Serializable

@Serializable
data class ReversedBuff(
    val function: List<FunctionEntity> = listOf(),
)
