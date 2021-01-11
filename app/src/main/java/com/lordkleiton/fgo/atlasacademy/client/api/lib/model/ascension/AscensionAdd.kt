package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.ascension

import kotlinx.serialization.Serializable

@Serializable
data class AscensionAdd(
    val individuality : AscensionAddEntryNiceTrait = AscensionAddEntryNiceTrait(),
    val voicePrefix : AscensionAddEntryInt = AscensionAddEntryInt(),
)
