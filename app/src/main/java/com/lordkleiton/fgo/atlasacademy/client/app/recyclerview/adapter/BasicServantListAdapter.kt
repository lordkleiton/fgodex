package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.lordkleiton.fgo.atlasacademy.client.R
import com.lordkleiton.fgo.atlasacademy.client.api.lib.model.basic.BasicServant
import com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter.listener.OnListItemClickListener
import java.util.*

class BasicServantListAdapter(
    private val context: Context,
    private val items: MutableList<BasicServant>,
    private val onItemClickListener: OnListItemClickListener,
) : RecyclerView.Adapter<BasicServantListAdapter.BasicServantViewHolder>() {
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BasicServantViewHolder, position: Int) {
        val item = items[position]

        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicServantViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_servant, parent, false)

        return BasicServantViewHolder(view, context, onItemClickListener)
    }

    val clear = {
        items.clear()

        notifyDataSetChanged()
    }

    val swap = { posInit: Int, posEnd: Int ->
        Collections.swap(items, posInit, posEnd)

        notifyItemMoved(posInit, posEnd)
    }

    val remove = { pos: Int ->
        items.removeAt(pos)

        notifyItemRemoved(pos)
    }

    val add = { servant: BasicServant ->
        items.add(servant)

        notifyItemInserted(items.lastIndex)
    }

    val update = { pos: Int, servant: BasicServant ->
        items[pos] = servant

        notifyItemChanged(pos)
    }

    class BasicServantViewHolder(
        view: View,
        private val context: Context,
        clickListener: OnListItemClickListener,
    ) :
        RecyclerView.ViewHolder(view) {
        private lateinit var servant: BasicServant
        private val img: ImageView
        private val svtId: TextView

        init {
            view.apply {
                img = findViewById(R.id.list_item_servant_img)
                svtId = findViewById(R.id.list_item_servant_id)

                setOnClickListener {
                    clickListener.onItemClick(servant, adapterPosition)
                }
            }
        }

        fun bind(servant: BasicServant) {
            this.servant = servant

            svtId.text = servant.collectionNo.toString()

            Glide.with(context).load(servant.face).placeholder(R.drawable.ic_launcher_foreground)
                .transform(
                    CenterCrop(), RoundedCorners(20))
                .into(img)
        }
    }
}
