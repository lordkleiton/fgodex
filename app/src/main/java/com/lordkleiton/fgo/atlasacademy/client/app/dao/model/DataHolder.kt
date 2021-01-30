package com.lordkleiton.fgo.atlasacademy.client.app.dao.model

data class DataHolder<T>(
    val map: MutableMap<Int, T> = mutableMapOf(),
    var init: Boolean = false,
)