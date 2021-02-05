package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener

import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.NiceVoiceGroupListAdapter

interface OnVoicePlayButtonClickListener {
    fun onItemClick(view: NiceVoiceGroupListAdapter.NiceVoiceGroupViewAdapter, pos: Int)
}