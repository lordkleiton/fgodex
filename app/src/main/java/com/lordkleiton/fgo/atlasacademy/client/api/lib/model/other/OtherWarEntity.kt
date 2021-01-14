package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstMap
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSpot
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstWar
import kotlinx.serialization.Serializable

@Serializable
data class OtherWarEntity(
    val mstWar: MstWar = MstWar(),
    val mstMap: List<MstMap> = listOf(),
    val mstSpot: List<MstSpot> = listOf(),
)
