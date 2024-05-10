package com.jyotsna.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val items = listOf(
            ListItem("Title 1", "Details 1", R.drawable.seas),
            ListItem("Title 2", "Details 2", R.drawable.ship),
            ListItem("Title 3", "Details 3", R.drawable.heaven)
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items.map { it.title })
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = items[position]

            // Start a new activity and pass the title, detail, and imageResId of the clicked item
            val intent = Intent(this, ItemDetailsActivity::class.java)
            intent.putExtra("title", selectedItem.title)
            intent.putExtra("detail", selectedItem.detail)
            intent.putExtra("imageResId", selectedItem.imageResId)
            startActivity(intent)
        }
    }
}
