package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_BOOL
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.enum.TraitEnum
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util.findEnumByName
import kotlinx.serialization.Serializable

@Serializable
data class NiceTrait(val id: Int, val negative: Boolean? = FALLBACK_BOOL, val name: String) {
    val nameEnum = findEnumByName<TraitEnum>(name)
}