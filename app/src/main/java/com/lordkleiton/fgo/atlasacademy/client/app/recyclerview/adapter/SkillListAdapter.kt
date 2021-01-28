package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lordkleiton.fgo.atlasacademy.client.R
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.nice.NiceSkill

class SkillListAdapter(private val context: Context) :
    ListAdapter<NiceSkill, SkillListAdapter.NiceSkillViewHolder>(NiceSkillViewHolder) {

    override fun onBindViewHolder(holder: NiceSkillViewHolder, position: Int) {
        val item = currentList[position]

        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NiceSkillViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_skill, parent, false)

        return NiceSkillViewHolder(view)
    }

    class NiceSkillViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private lateinit var skill: NiceSkill

        private val title: TextView
        private val description: TextView
        private val img: ImageView

        init {
            view.apply {
                title = findViewById(R.id.list_item_skill_card_name)
                description = findViewById(R.id.list_item_skill_card_desc)
                img = findViewById(R.id.list_item_skill_card_img)
            }
        }

        fun bind(skill: NiceSkill) {
            this.skill = skill

            title.text = skill.name
            description.text = skill.detail

            Glide.with(view).load(skill.icon).into(img)
        }

        companion object : DiffUtil.ItemCallback<NiceSkill>() {
            override fun areContentsTheSame(oldItem: NiceSkill, newItem: NiceSkill): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: NiceSkill, newItem: NiceSkill): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}