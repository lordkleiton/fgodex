package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSkill
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSkillDetail
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSkillLv
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstSvtSkill
import kotlinx.serialization.Serializable

@Serializable
data class SkillEntityNoReverse(
    val mstSkill: MstSkill = MstSkill(),
    val mstSkillDetail: List<MstSkillDetail> = listOf(),
    val mstSvtSkill: List<MstSvtSkill> = listOf(),
    val mstSkillLv: List<MstSkillLv> = listOf(),
)
