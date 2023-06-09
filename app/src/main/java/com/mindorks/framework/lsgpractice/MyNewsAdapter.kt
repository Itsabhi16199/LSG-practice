package com.mindorks.framework.lsgpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyNewsAdapter : RecyclerView.Adapter<MyNewsAdapter.ViewHolder>() {

    val items = arrayOf(R.drawable.lsg_picture,R.drawable.lsg_picture,R.drawable.lsg_picture,R.drawable.lsg_picture)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
//        holder.imageView.setImageResource(R.drawable.lsg_picture)
        holder.imageView.setImageResource(item)
//        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.findViewById<ImageView>(R.id.images)
//        fun bind(item: Int) {
////            itemView.findViewById<ImageView>(R.id.images)
//            imageView.setImageResource(item)
//
//            // Bind your data to the item view
//        }
    }
}