package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceBuffTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceTrait
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class BasicBuff(
    val id: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val icon: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val vals: List<NiceTrait> = listOf(),
    val tvals: List<NiceTrait> = listOf(),
    val ckSelfIndv: List<NiceTrait> = listOf(),
    val ckOpIndv: List<NiceTrait> = listOf(),
) {
    val typeEnum = findEnumByName<NiceBuffTypeEnum>(type)
}