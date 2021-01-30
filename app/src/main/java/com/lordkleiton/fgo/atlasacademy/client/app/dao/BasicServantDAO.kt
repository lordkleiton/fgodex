package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.model.DataHolder
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION

object BasicServantDAO {
    private val NA = DataHolder<BasicServant>()
    private val JP = DataHolder<BasicServant>()

    private fun selectHolder(region: EnumRegion) = when (region) {
        EnumRegion.NA -> NA
        EnumRegion.JP -> JP
    }

    private fun toList(region: EnumRegion) =
        selectHolder(region).map.toList().map { it.second }.sortedBy { it.collectionNo }

    private suspend fun request(
        region: EnumRegion,
    ): List<BasicServant> {
        val holder = selectHolder(region)

        RequestsRepository.basic.findAllServant(region)?.forEach { holder.map[it.id] = it }

        holder.init = true

        return toList(region)
    }

    suspend fun find(region: EnumRegion = DEFAULT_REGION) =
        if (selectHolder(region).init) toList(region) else request(region)

    suspend fun get(
        id: Int,
        region: EnumRegion = DEFAULT_REGION,
    ): BasicServant? {
        val holder = selectHolder(region).map
        var result = holder[id]

        if (result == null) {
            val req = RequestsRepository.basic.getServant(region, id)

            if (req != null) {
                result = req

                holder[id] = result
            }
        }

        return result
    }
}