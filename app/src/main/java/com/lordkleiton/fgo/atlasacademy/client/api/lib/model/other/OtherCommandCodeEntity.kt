package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstCommandCode
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.mst.MstCommandCodeComment
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntityNoReverse
import kotlinx.serialization.Serializable

@Serializable
data class OtherCommandCodeEntity(
    val mstCommandCode: MstCommandCode = MstCommandCode(),
    val mstSkill: List<SkillEntityNoReverse> = listOf(),
    val mstCommandCodeComment: MstCommandCodeComment = MstCommandCodeComment(),
)
