package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.basic

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base.BaseRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumExportEndpoint
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
        options: Map<String, String> = baseGet.options,
    ): BasicServant? = get(EnumEndpoint.servant, region, id, options)

    suspend fun getEquip(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicEquip? = get(EnumEndpoint.equip, region, id, options)

    suspend fun getSvt(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicServant? = get(EnumEndpoint.servant, region, id, options)

    suspend fun getMC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicMysticCode? = get(EnumEndpoint.MC, region, id, options)

    suspend fun getCC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicCommandCode? = get(EnumEndpoint.CC, region, id, options)

    suspend fun getSkill(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicSkillReverse? = get(EnumEndpoint.skill, region, id, options)

    suspend fun getNP(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicTdReverse? = get(EnumEndpoint.NP, region, id, options)

    suspend fun getFunction(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicFunctionReverse? = get(EnumEndpoint.function, region, id, options)

    suspend fun getBuff(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicBuff? = get(EnumEndpoint.buff, region, id, options)

    suspend fun getEvent(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicEvent? = get(EnumEndpoint.event, region, id, options)

    suspend fun getWar(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): BasicWar? = get(EnumEndpoint.war, region, id, options)

    /* findAll */

    suspend fun findAllServant(
        region: EnumRegion = baseFind.region,
    ): List<BasicServant>? = findAll(EnumExportEndpoint.basic_servant, region)

    suspend fun findAllServantEnglishName(
    ): List<BasicServant>? = findAll(EnumExportEndpoint.basic_servant_lang_en, EnumRegion.JP)

    suspend fun findAllCE(
        region: EnumRegion = baseFind.region,
    ): List<BasicEquip>? = findAll(EnumExportEndpoint.basic_equip, region)

    suspend fun findAllCEEnglishName(
    ): List<BasicEquip>? = findAll(EnumExportEndpoint.basic_equip_lang_en, EnumRegion.JP)

    suspend fun findAllCC(
        region: EnumRegion = baseFind.region,
    ): List<BasicCommandCode>? = findAll(EnumExportEndpoint.basic_command_code, region)

    suspend fun findAllMC(
        region: EnumRegion = baseFind.region,
    ): List<BasicMysticCode>? = findAll(EnumExportEndpoint.basic_mystic_code, region)

    suspend fun findAllWar(
        region: EnumRegion = baseFind.region,
    ): List<BasicWar>? = findAll(EnumExportEndpoint.basic_war, region)

    suspend fun findAllEvent(
        region: EnumRegion = baseFind.region,
    ): List<BasicEvent>? = findAll(EnumExportEndpoint.basic_event, region)
}