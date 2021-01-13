package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstFunc
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed.ReversedFunctionType
import kotlinx.serialization.Serializable

@Serializable
data class FunctionEntity(
    val mstFunc: MstFunc = MstFunc(),
    val reverse: ReversedFunctionType = ReversedFunctionType(),
)
