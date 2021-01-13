package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.buff

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstBuff
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed.ReversedBuffType
import kotlinx.serialization.Serializable

@Serializable
data class BuffEntity(
    val mstBuff: MstBuff = MstBuff(),
    val reverse: ReversedBuffType = ReversedBuffType(),
)
