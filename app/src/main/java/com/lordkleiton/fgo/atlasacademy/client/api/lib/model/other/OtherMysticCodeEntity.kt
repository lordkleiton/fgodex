package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstEquip
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstEquipExp
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class OtherMysticCodeEntity(
    val mstEquip: MstEquip = MstEquip(),
    val mstSkill: List<SkillEntityNoReverse> = listOf(),
    val mstEquipExp: List<MstEquipExp> = listOf(),
)
