package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicReversedBuff
import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedBuffType(
    val nice: NiceReversedBuff = NiceReversedBuff(),
    val basic: BasicReversedBuff = BasicReversedBuff(),
)
