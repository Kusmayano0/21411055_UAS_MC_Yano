package com.example.a21411055_uas_mc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TumbuhanMyAdapter(private val TumbuhanList: ArrayList<Tumbuhan>): RecyclerView.Adapter<TumbuhanMyAdapter.ImageViewHolder>(){

    var onItemClick : ((Tumbuhan) -> Unit)? = null

    class ImageViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id._image)
        val imageTitle : TextView = itemView.findViewById(R.id._title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,
            false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return TumbuhanList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val Tumbuhan = TumbuhanList[position]
        holder.imageView.setImageResource(Tumbuhan.imageSource)
        holder.imageTitle.text = Tumbuhan.ImageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Tumbuhan)
        }
    }
}