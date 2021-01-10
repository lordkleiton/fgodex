package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_INT
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.const.Const.FALLBACK_STRING
import kotlinx.serialization.Serializable

@Serializable
data class NiceBuffScript(
    val relationId: NiceBuffRelationOverwrite = NiceBuffRelationOverwrite(),
    val ReleaseText: String = FALLBACK_STRING,
    val DamageRelease: Int = FALLBACK_INT,
    val INDIVIDUALITIE: NiceTrait = NiceTrait(),
)
