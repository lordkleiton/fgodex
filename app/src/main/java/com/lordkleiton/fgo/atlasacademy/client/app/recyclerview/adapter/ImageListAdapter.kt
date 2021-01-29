package com.lordkleiton.fgo.atlasacademy.client.app.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lordkleiton.fgo.atlasacademy.client.R
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_IMAGE_CROP
import com.lordkleiton.fgo.atlasacademy.client.app.utils.AppEnums.DEFAULT_IMAGE_ROUNDING
import com.lordkleiton.fgo.atlasacademy.client.app.utils.toDp

class ImageListAdapter(
    private val context: Context,
    private val width: Int,
    private val height: Int,
) :
    ListAdapter<String, ImageListAdapter.UrlViewHolder>(UrlViewHolder) {

    override fun onBindViewHolder(holder: UrlViewHolder, position: Int) {
        val item = currentList[position]

        holder.bind(item, height, width)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UrlViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_item_image_holder, parent, false)

        return UrlViewHolder(view, context)
    }

    class UrlViewHolder(view: View, private val context: Context) :
        RecyclerView.ViewHolder(view) {
        private val img: ImageView

        init {
            view.apply {
                img = findViewById(R.id.list_item_image_holder)
            }
        }

        fun bind(url: String, height: Int, width: Int) {
            img.apply {
                layoutParams.apply {
                    this.height = height.toDp(context)
                    this.width = width.toDp(context)

                    requestLayout()
                }
            }

            Glide.with(context).load(url).transform(DEFAULT_IMAGE_CROP, DEFAULT_IMAGE_ROUNDING)
                .into(img)
        }

        companion object : DiffUtil.ItemCallback<String>() {
            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }
}