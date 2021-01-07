package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceBuffTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class BasicBuff(
    val id: Int,
    val name: String,
    val icon: String,
    val type: String,
) {
    val buffType = findEnumByName<NiceBuffTypeEnum>(type)
}