package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other

import kotlinx.serialization.Serializable

@Serializable
data class OtherHTTPValidationError(
    val detail: List<OtherValidationError> = listOf(),
)
