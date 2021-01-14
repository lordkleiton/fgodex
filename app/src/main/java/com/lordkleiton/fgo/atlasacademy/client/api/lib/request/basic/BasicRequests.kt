package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base.BaseRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
object BasicRequests : BaseRequests(EnumType.basic) {
    /* find */

    suspend fun findServant(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicServant>? = find(EnumEndpoint.servant, region, options)

    suspend fun findEquip(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicEquip>? = find(EnumEndpoint.equip, region, options)

    suspend fun findSvt(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicServant>? = find(EnumEndpoint.servant, region, options)

    suspend fun findSkill(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicSkillReverse>? = find(EnumEndpoint.skill, region, options)

    suspend fun findNP(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicTdReverse>? = find(EnumEndpoint.NP, region, options)

    suspend fun findFunction(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicFunctionReverse>? = find(EnumEndpoint.function, region, options)

    suspend fun findBuff(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BasicBuff>? = find(EnumEndpoint.buff, region, options)

    /* get */

    suspend fun getServant(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicServant? = get(EnumEndpoint.servant, region, id)

    suspend fun getEquip(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicEquip? = get(EnumEndpoint.equip, region, id)

    suspend fun getSvt(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicServant? = get(EnumEndpoint.servant, region, id)

    suspend fun getMC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicMysticCode? = get(EnumEndpoint.MC, region, id)

    suspend fun getCC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicCommandCode? = get(EnumEndpoint.CC, region, id)

    suspend fun getSkill(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicSkillReverse? = get(EnumEndpoint.skill, region, id)

    suspend fun getNP(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicTdReverse? = get(EnumEndpoint.NP, region, id)

    suspend fun getFunction(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicFunctionReverse? = get(EnumEndpoint.function, region, id)

    suspend fun getBuff(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicBuff? = get(EnumEndpoint.buff, region, id)

    suspend fun getEvent(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicEvent? = get(EnumEndpoint.event, region, id)

    suspend fun getWar(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BasicWar? = get(EnumEndpoint.war, region, id)
}