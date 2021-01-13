package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstEvent
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstShop
import kotlinx.serialization.Serializable

@Serializable
data class OtherEventEntity(
    val mstEvent: MstEvent = MstEvent(),
    val mstShop: List<MstShop> = listOf(),
)
