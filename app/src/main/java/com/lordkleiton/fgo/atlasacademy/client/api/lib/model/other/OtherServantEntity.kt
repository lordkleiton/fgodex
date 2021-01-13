package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntityNoReverse
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.td.TdEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class OtherServantEntity(
    val mstSvt: MstSvt = MstSvt(),
    val mstSkill: List<SkillEntityNoReverse> = listOf(),
    val mstTreasureDevice: List<TdEntityNoReverse> = listOf(),
    val mstSvtCard: List<MstSvtCard> = listOf(),
    val mstSvtLimit: List<MstSvtLimit> = listOf(),
    val mstCombineSkill: List<MstCombineSkill> = listOf(),
    val mstCombineLimit: List<MstCombineLimit> = listOf(),
    val mstCombineCostume: List<MstCombineCostume> = listOf(),
    val mstSvtLimitAdd: List<MstSvtLimitAdd> = listOf(),
    val mstSvtChange: List<MstSvtChange> = listOf(),
    val mstSvtCostume: List<MstSvtCostume> = listOf(),
    val mstSvtScript: List<MstSvtScript> = listOf(),
    val mstSvtComment: List<MstSvtComment> = listOf(),
    val mstSvtVoice: List<MstSvtVoice> = listOf(),
    val mstSubtitle: List<OtherGlobalNewMstSubtitle> = listOf(),
)
