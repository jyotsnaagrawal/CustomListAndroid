package com.jyotsna.customlistview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, private val items: List<ListItem>) :
    ArrayAdapter<ListItem>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item_custom, parent, false)
        }

        val currentItem = items[position]

        val imageView = itemView!!.findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(currentItem.imageResId)

        val titleTextView = itemView.findViewById<TextView>(R.id.titleTextView)
        titleTextView.text = currentItem.title

        val detailTextView = itemView.findViewById<TextView>(R.id.detailTextView)
        detailTextView.text = currentItem.detail

        return itemView
    }
}
