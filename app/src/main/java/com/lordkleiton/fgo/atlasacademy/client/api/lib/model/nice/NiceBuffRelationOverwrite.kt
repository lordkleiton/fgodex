package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.OtherRelationOverwriteDetail
import kotlinx.serialization.Serializable

@Serializable
data class NiceBuffRelationOverwrite(
    val atkSide: Map<String, OtherRelationOverwriteDetail> = mapOf(),
    val defSide: Map<String, OtherRelationOverwriteDetail> = mapOf(),
)
