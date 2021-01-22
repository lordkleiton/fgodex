package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener

import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant

interface OnListItemClickListener {
    fun onItemClick(servant: BasicServant, position: Int)
}