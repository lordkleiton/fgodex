package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION

object NiceServantDAO {
    private val NA = mutableMapOf<Int, NiceServant?>()
    private val JP = mutableMapOf<Int, NiceServant?>()
    private val JP_EN = mutableMapOf<Int, NiceServant?>()

    private fun selectMap(region: EnumRegion) = when (region) {
        EnumRegion.NA -> NA
        EnumRegion.JP -> JP
    }

    private suspend fun request(id: Int, region: EnumRegion): NiceServant? {
        val res = RequestsRepository.nice.getServant(region, id)
        val map = selectMap(region)

        map[id] = res

        return res
    }

    suspend fun get(id: Int, region: EnumRegion = DEFAULT_REGION): NiceServant? =
        selectMap(region)[id] ?: request(id, region)

    fun available(region: EnumRegion = DEFAULT_REGION) =
        selectMap(region).toList().map { it.second }
}
