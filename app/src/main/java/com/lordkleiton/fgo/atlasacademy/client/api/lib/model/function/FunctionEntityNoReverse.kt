package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstFunc
import kotlinx.serialization.Serializable

@Serializable
data class FunctionEntityNoReverse(
    val mstFunc: MstFunc = MstFunc(),
)
