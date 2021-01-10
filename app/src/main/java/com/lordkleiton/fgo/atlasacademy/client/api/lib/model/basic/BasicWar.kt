package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class BasicWar(
    val id: Int = FALLBACK_INT,
    val coordinates: List<List<Int>> = listOf(),
    val age: String = FALLBACK_STRING,
    val name: String = FALLBACK_STRING,
    val longName: String = FALLBACK_STRING,
    val eventId: Int = FALLBACK_INT,
)
