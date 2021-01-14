package com.lordkleiton.fgo.atlasacademy.client.api.lib.request

import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.basic.BasicRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.nice.NiceRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.raw.RawRequests
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
object RequestsRepository {
    val basic = BasicRequests
    val nice = NiceRequests
    val raw = RawRequests
}