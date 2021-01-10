package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.NiceSvtTypeEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.SvtClassEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class BasicServant(
    val id: Int = FALLBACK_INT,
    val collectionNo: Int = FALLBACK_INT,
    val name: String = FALLBACK_STRING,
    val type: String = FALLBACK_STRING,
    val className: String = FALLBACK_STRING,
    val rarity: Int = FALLBACK_INT,
    val atkMax: Int = FALLBACK_INT,
    val hpMax: Int = FALLBACK_INT,
    val face: String = FALLBACK_STRING
) {
    val typeEnum = findEnumByName<NiceSvtTypeEnum>(type)
    val classNameEnum = findEnumByName<SvtClassEnum>(type)
}