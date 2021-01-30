package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.dao.model.DataHolder
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION
import com.lordkleiton.fgo.atlasacademy.client.app.utils.opposite

object BasicServantDAO {
    private val NA = DataHolder<BasicServant>()
    private val JP = DataHolder<BasicServant>()
    private val JP_EN = DataHolder<BasicServant>()

    private fun selectHolder(region: EnumRegion) =
        when (region) {
            EnumRegion.NA -> NA
            EnumRegion.JP -> JP
        }

    private fun selectOppositeHolder(region: EnumRegion) =
        when (region) {
            EnumRegion.NA -> JP_EN
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

    private suspend fun getServant(id: Int, english: Boolean) =
        RequestsRepository.basic.getServant(
            EnumRegion.JP,
            id,
            if (english) mapOf("lang" to "en") else mapOf())

    suspend fun complementaryServant(id: Int, region: EnumRegion): BasicServant? {
        val aux = region.opposite()
        val holder = selectOppositeHolder(aux)

        return holder.map[id] ?: suspend {
            val req = getServant(id, aux == EnumRegion.NA)

            if (req != null) holder.map[id] = req

            req
        }.invoke()
    }
}