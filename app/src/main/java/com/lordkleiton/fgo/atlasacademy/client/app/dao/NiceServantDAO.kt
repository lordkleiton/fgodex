package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion

object NiceServantDAO {
    private val listNA = mutableMapOf<Int, NiceServant?>()
    private val listJP = mutableMapOf<Int, NiceServant?>()

    private suspend fun requestServant(id: Int, region: EnumRegion = EnumRegion.NA): NiceServant? {
        val res = RequestsRepository.nice.getServant(region, id)

        when (region) {
            EnumRegion.NA -> listNA[id] = res
            EnumRegion.JP -> listJP[id] = res
        }

        return res
    }

    suspend fun getServant(id: Int, region: EnumRegion = EnumRegion.NA): NiceServant? =
        when (region) {
            EnumRegion.NA -> listNA[id]
            EnumRegion.JP -> listJP[id]
        } ?: requestServant(id, region)

    fun getAllServantsNA() = listNA.toList().map { it.second }

    fun getAllServantsJP() = listNA.toList().map { it.second }
}
