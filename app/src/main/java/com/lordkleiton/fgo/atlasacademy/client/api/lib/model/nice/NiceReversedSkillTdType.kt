package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicReversedSkillTd
import kotlinx.serialization.Serializable

@Serializable
data class NiceReversedSkillTdType(
    val nice: NiceReversedSkillTd = NiceReversedSkillTd(),
    val basic: BasicReversedSkillTd = BasicReversedSkillTd(),
)
