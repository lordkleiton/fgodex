package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.lordkleiton.fgo.atlasacademy.client.R
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceVoiceGroup
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener.OnVoicePlayButtonClickListener

class NiceVoiceGroupListAdapter(
    private val context: Context,
    private val listener: OnVoicePlayButtonClickListener,
) :
    ListAdapter<NiceVoiceGroup, NiceVoiceGroupListAdapter.NiceVoiceGroupViewAdapter>(
        NiceVoiceGroupViewAdapter) {
    private val views = mutableListOf<NiceVoiceGroupViewAdapter>()

    fun getViews() = views.toList()

    override fun onBindViewHolder(holder: NiceVoiceGroupViewAdapter, position: Int) {
        val item = currentList[position]

        holder.bind(item)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): NiceVoiceGroupViewAdapter {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_item_audio_player, parent, false)
        val result = NiceVoiceGroupViewAdapter(view, listener)

        if (!views.contains(result)) views.add(result)

        return result
    }

    class NiceVoiceGroupViewAdapter(
        val view: View,
        listener: OnVoicePlayButtonClickListener,
    ) : RecyclerView.ViewHolder(view) {
        private lateinit var group: NiceVoiceGroup
        private var playing = false

        private val btn: ImageButton
        private val progress: LinearProgressIndicator
        private val dPlay: Drawable?
        private val dPause: Drawable?

        init {
            view.apply {
                btn = findViewById(R.id.list_item_audio_player_button)
                progress = findViewById(R.id.list_item_audio_player_progress)

                dPlay =
                    AppCompatResources.getDrawable(context, R.drawable.ic_baseline_play_arrow_24)
                dPause = AppCompatResources.getDrawable(context, R.drawable.ic_baseline_pause_24)

                btn.setOnClickListener {
                    listener.onItemClick(this@NiceVoiceGroupViewAdapter, adapterPosition)
                }

                toggleButton()
            }
        }

        fun bind(voiceGroup: NiceVoiceGroup) {
            group = voiceGroup
        }

        fun updateProgress(progress: Int) {
            this.progress.progress = progress
        }

        fun toPlay() {
            btn.setImageDrawable(dPlay)

            playing = true
        }

        fun toggleButton() {
            when (playing) {
                true -> btn.setImageDrawable(dPause)
                else -> btn.setImageDrawable(dPlay)
            }

            playing = !playing
        }

        companion object : DiffUtil.ItemCallback<NiceVoiceGroup>() {
            override fun areContentsTheSame(
                oldItem: NiceVoiceGroup,
                newItem: NiceVoiceGroup,
            ): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(
                oldItem: NiceVoiceGroup,
                newItem: NiceVoiceGroup,
            ): Boolean {
                return oldItem.svtId == newItem.svtId
            }
        }
    }
}