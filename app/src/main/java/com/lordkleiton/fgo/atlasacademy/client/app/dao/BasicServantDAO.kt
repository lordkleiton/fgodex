package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION

object BasicServantDAO {
    private val NA = mutableMapOf<Int, BasicServant?>()
    private val JP = mutableMapOf<Int, BasicServant?>()

    private fun selectMap(region: EnumRegion) = when (region) {
        EnumRegion.NA -> NA
        EnumRegion.JP -> JP
    }

    fun available(region: EnumRegion = DEFAULT_REGION) =
        selectMap(region).toList().map { it.second }

    suspend fun request(region: EnumRegion = DEFAULT_REGION): List<BasicServant?> {
        val map = selectMap(region)

        RequestsRepository.basic.findAllServant(region)?.forEach { map[it.id] = it }

        return available(region)
    }
}