package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class BasicSkillReverse(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val icon: String = FALLBACK_STRING,
    val reverse: BasicReversedSkillTdType,
)
