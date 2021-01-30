package com.lordkleiton.fgo.atlasacademy.client.api.lib.request.nice

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.*
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.base.BaseRequests
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumEndpoint
import com.lordkleiton.fgo.atlasacademy.client.api.lib.request.enum.EnumExportEndpoint
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
        options: Map<String, String> = baseGet.options,
    ): NiceServant? = get(EnumEndpoint.servant, region, id, options)

    suspend fun getEquip(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceEquip? = get(EnumEndpoint.equip, region, id, options)

    suspend fun getSvt(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceServant? = get(EnumEndpoint.svt, region, id, options)

    suspend fun getMC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceMysticCode? = get(EnumEndpoint.MC, region, id, options)

    suspend fun getCC(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceCommandCode? = get(EnumEndpoint.CC, region, id, options)

    suspend fun getSkill(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceSkill? = get(EnumEndpoint.skill, region, id, options)

    suspend fun getNP(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceTdReverse? = get(EnumEndpoint.NP, region, id, options)

    suspend fun getFunction(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceFunction? = get(EnumEndpoint.function, region, id, options)

    suspend fun getBuff(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceBuff? = get(EnumEndpoint.buff, region, id, options)

    suspend fun getItem(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceItem? = get(EnumEndpoint.item, region, id, options)

    suspend fun getEvent(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceEvent? = get(EnumEndpoint.event, region, id, options)

    suspend fun getWar(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceWar? = get(EnumEndpoint.war, region, id, options)

    suspend fun getQuest(
        region: EnumRegion = baseFind.region,
        id: Int = baseGet.id,
        options: Map<String, String> = baseGet.options,
    ): NiceQuest? = get(EnumEndpoint.quest, region, id, options)

    /* findAll */

    suspend fun findAllServant(
        region: EnumRegion = baseFind.region,
    ): List<NiceServant>? = findAll(EnumExportEndpoint.nice_servant, region)

    suspend fun findAllServantLore(
        region: EnumRegion = baseFind.region,
    ): List<NiceServant>? = findAll(EnumExportEndpoint.nice_servant_lore, region)

    suspend fun findAllServantEnglishName(
    ): List<NiceServant>? = findAll(EnumExportEndpoint.nice_servant_lang_en, EnumRegion.JP)

    suspend fun findAllServantEnglishNameLore(
    ): List<NiceServant>? = findAll(EnumExportEndpoint.nice_servant_lore_lang_en, EnumRegion.JP)

    suspend fun findAllCE(
        region: EnumRegion = baseFind.region,
    ): List<NiceEquip>? = findAll(EnumExportEndpoint.nice_equip, region)

    suspend fun findAllCELore(
        region: EnumRegion = baseFind.region,
    ): List<NiceEquip>? = findAll(EnumExportEndpoint.nice_equip_lore, region)

    suspend fun findAllCEEnglishName(
    ): List<NiceEquip>? = findAll(EnumExportEndpoint.nice_equip_lang_en, EnumRegion.JP)

    suspend fun findAllCEEnglishNameLore(
    ): List<NiceEquip>? = findAll(EnumExportEndpoint.nice_equip_lore_lang_en, EnumRegion.JP)

    suspend fun findAllCC(
        region: EnumRegion = baseFind.region,
    ): List<NiceCommandCode>? = findAll(EnumExportEndpoint.nice_command_code, region)

    suspend fun findAllMC(
        region: EnumRegion = baseFind.region,
    ): List<NiceMysticCode>? = findAll(EnumExportEndpoint.nice_mystic_code, region)

}
