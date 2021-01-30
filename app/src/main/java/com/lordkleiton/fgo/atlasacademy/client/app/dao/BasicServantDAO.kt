package com.lordkleiton.fgo.atlasacademy.client.app.dao

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.RequestsRepository
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_ENGLISH
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_REGION

object BasicServantDAO {
    private val NA = mutableMapOf<Int, BasicServant>()
    private val JP = mutableMapOf<Int, BasicServant>()
    private val JP_EN = mutableMapOf<Int, BasicServant>()

    private fun selectMap(region: EnumRegion, english: Boolean) = when (region) {
        EnumRegion.NA -> NA
        EnumRegion.JP -> when (english) {
            DEFAULT_ENGLISH -> JP_EN
            else -> JP
        }
    }

    fun available(region: EnumRegion = DEFAULT_REGION, english: Boolean = DEFAULT_ENGLISH) =
        selectMap(region, english).toList().map { it.second }

    suspend fun request(
        region: EnumRegion = DEFAULT_REGION,
    ): List<BasicServant> {
        val map = selectMap(region, !DEFAULT_ENGLISH)

        RequestsRepository.basic.findAllServant(region)?.forEach { map[it.id] = it }

        if (region == EnumRegion.JP) {
            RequestsRepository.basic.findAllServantEnglishName()?.forEach { JP_EN[it.id] = it }
        }

        return available(region)
    }

    suspend fun get(
        id: Int,
        region: EnumRegion = DEFAULT_REGION,
        english: Boolean = DEFAULT_ENGLISH,
    ): BasicServant? {
        val map = selectMap(region, english)
        var result = map[id]

        if (result == null) {
            val req = RequestsRepository.basic.getServant(region, id)

            if (req != null) {
                result = req

                map[id] = result
            }
        }

        return result
    }
}