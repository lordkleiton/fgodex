package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.const

object Const {
    const val MEDIA_TYPE = "application/json"
    const val BASE_URL = "https://api.atlasacademy.io/"
    const val URL_TYPE = "type"
    const val URL_REGION = "region"
    const val URL_ENDPOINT = "endpoint"
    const val URL_ID = "id"
    const val FIND_URL = "{$URL_TYPE}/{$URL_REGION}/{$URL_ENDPOINT}/search"
    const val GET_URL = "{$URL_TYPE}/{$URL_REGION}/{$URL_ENDPOINT}/{$URL_ID}"
    const val EXPORT_URL = "export/{$URL_REGION}/{$URL_ENDPOINT}.json"
}