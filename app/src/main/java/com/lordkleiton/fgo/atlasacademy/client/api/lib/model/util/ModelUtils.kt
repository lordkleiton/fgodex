package com.lordkleiton.fgo.atlasacademy.client.api.lib.model.util

inline fun <reified T : Enum<T>> findEnumByName(type: String): T? {
    return try {
        java.lang.Enum.valueOf(T::class.java, type)
    } catch (e: Exception) {
        null
    }
}