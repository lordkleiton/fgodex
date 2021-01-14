package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base.BaseRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
object NiceRequests : BaseRequests(EnumType.nice) {
    /* find */

    suspend fun findServant(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceServant>? = find(EnumEndpoint.servant, region, options)

    suspend fun findEquip(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceEquip>? = find(EnumEndpoint.equip, region, options)

    suspend fun findSvt(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceServant>? = find(EnumEndpoint.svt, region, options)

    suspend fun findSkill(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceSkill>? = find(EnumEndpoint.skill, region, options)

    suspend fun findNp(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceTdReverse>? = find(EnumEndpoint.NP, region, options)

    suspend fun findFunction(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceFunction>? = find(EnumEndpoint.function, region, options)

    suspend fun findBuff(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<NiceBuff>? = find(EnumEndpoint.buff, region, options)

    /* get */

    suspend fun getServant(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceServant? = get(EnumEndpoint.servant, region, id)

    suspend fun getEquip(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceEquip? = get(EnumEndpoint.equip, region, id)

    suspend fun getSvt(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceServant? = get(EnumEndpoint.svt, region, id)

    suspend fun getMC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceMysticCode? = get(EnumEndpoint.MC, region, id)

    suspend fun getCC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceCommandCode? = get(EnumEndpoint.CC, region, id)

    suspend fun getSkill(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceSkill? = get(EnumEndpoint.skill, region, id)

    suspend fun getNP(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceTdReverse? = get(EnumEndpoint.NP, region, id)

    suspend fun getFunction(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceFunction? = get(EnumEndpoint.function, region, id)

    suspend fun getBuff(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceBuff? = get(EnumEndpoint.buff, region, id)

    suspend fun getItem(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceItem? = get(EnumEndpoint.item, region, id)

    suspend fun getEvent(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceEvent? = get(EnumEndpoint.event, region, id)

    suspend fun getWar(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceWar? = get(EnumEndpoint.war, region, id)

    suspend fun getQuest(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): NiceQuest? = get(EnumEndpoint.quest, region, id)
}