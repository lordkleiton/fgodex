package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
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

    class NiceSkillViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private lateinit var skill: NiceSkill
        private val txt: TextView

        private val text2: TextView
        private val text3: TextView

        init {
            view.apply {
                txt = findViewById(R.id.list_item_skill_name)

                text2 = findViewById(R.id.list_item_skill_card_name)
                text3 = findViewById(R.id.list_item_skill_card_desc)
            }
        }

        fun bind(skill: NiceSkill) {
            this.skill = skill

            txt.text = skill.name

            text2.text = skill.name
            text3.text = skill.detail
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