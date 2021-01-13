package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.td

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSvtTreasureDevice
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDevice
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDeviceDetail
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDeviceLv
import kotlinx.serialization.Serializable

@Serializable
data class TdEntityNoReverse(
    val mstTreasureDevice: MstTreasureDevice = MstTreasureDevice(),
    val mstTreasureDeviceDetail: List<MstTreasureDeviceDetail> = listOf(),
    val mstSvtTreasureDevice: List<MstSvtTreasureDevice> = listOf(),
    val mstTreasureDeviceLv: List<MstTreasureDeviceLv> = listOf(),
)
