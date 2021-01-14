package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.raw

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.buff.BuffEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.function.FunctionEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.other.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.skill.SkillEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.td.TdEntity
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base.BaseRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumRegion
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumType
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
object RawRequests : BaseRequests(EnumType.raw) {
    /* find */

    suspend fun findServant(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<OtherServantEntity>? = find(EnumEndpoint.servant, region, options)

    suspend fun findEquip(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<OtherServantEntity>? = find(EnumEndpoint.equip, region, options)

    suspend fun findSvt(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<OtherServantEntity>? = find(EnumEndpoint.svt, region, options)

    suspend fun findSkill(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<SkillEntity>? = find(EnumEndpoint.skill, region, options)

    suspend fun findNP(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<TdEntity>? = find(EnumEndpoint.NP, region, options)

    suspend fun findFunction(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<FunctionEntity>? = find(EnumEndpoint.function, region, options)

    suspend fun findBuff(
        region: EnumRegion = baseFind.region,
        options: Map<String, String> = baseFind.options,
    ): List<BuffEntity>? = find(EnumEndpoint.buff, region, options)


    /* get */

    suspend fun getServant(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherServantEntity? = get(EnumEndpoint.servant, region, id)

    suspend fun getEquip(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherServantEntity? = get(EnumEndpoint.equip, region, id)

    suspend fun getSvt(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherServantEntity? = get(EnumEndpoint.svt, region, id)

    suspend fun getMC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherMysticCodeEntity? = get(EnumEndpoint.MC, region, id)

    suspend fun getCC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherCommandCodeEntity? = get(EnumEndpoint.CC, region, id)

    suspend fun getSkill(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): SkillEntity? = get(EnumEndpoint.skill, region, id)

    suspend fun getNP(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): TdEntity? = get(EnumEndpoint.NP, region, id)

    suspend fun getFunction(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): FunctionEntity? = get(EnumEndpoint.function, region, id)

    suspend fun getBuff(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): BuffEntity? = get(EnumEndpoint.buff, region, id)

    suspend fun getItem(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherItemEntity? = get(EnumEndpoint.item, region, id)

    suspend fun getEvent(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherEventEntity? = get(EnumEndpoint.event, region, id)

    suspend fun getWar(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherWarEntity? = get(EnumEndpoint.war, region, id)

    suspend fun getQuest(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
    ): OtherQuestEntity? = get(EnumEndpoint.quest, region, id)
}