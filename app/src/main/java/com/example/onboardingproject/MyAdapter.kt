package com.example.onboardingproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onboardingproject.models.ItemProperties
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(private val data: List<ItemProperties>) : RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(itemProperties: ItemProperties){
            val title = view.findViewById<TextView>(R.id.item_title)
            val image = view.findViewById<ImageView>(R.id.item_image)

            title.text = itemProperties.title
            Glide.with(view.context).load(itemProperties.image.small).into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

