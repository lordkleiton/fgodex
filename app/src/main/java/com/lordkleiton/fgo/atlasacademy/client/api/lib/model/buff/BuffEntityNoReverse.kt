package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.buff

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstBuff
import kotlinx.serialization.Serializable

@Serializable
data class BuffEntityNoReverse(
    val mstBuff: MstBuff = MstBuff()
)
