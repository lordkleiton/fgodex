package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.td

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSvtTreasureDevice
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDevice
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDeviceDetail
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstTreasureDeviceLv
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.reversed.ReversedSkillTdType
import kotlinx.serialization.Serializable

@Serializable
data class TdEntity(
    val mstTreasureDevice: MstTreasureDevice = MstTreasureDevice(),
    val mstTreasureDeviceDetail: List<MstTreasureDeviceDetail> = listOf(),
    val mstSvtTreasureDevice: List<MstSvtTreasureDevice> = listOf(),
    val mstTreasureDeviceLv: List<MstTreasureDeviceLv> = listOf(),
    val reverse: ReversedSkillTdType = ReversedSkillTdType(),
)
