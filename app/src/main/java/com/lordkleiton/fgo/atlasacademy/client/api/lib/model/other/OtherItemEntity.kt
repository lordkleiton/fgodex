package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstItem
import kotlinx.serialization.Serializable

@Serializable
data class OtherItemEntity(
    val mstItem: MstItem = MstItem()
)
