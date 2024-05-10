package com.jyotsna.customlistview


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class ItemDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.getStringExtra("title")
        val details = intent.getStringExtra("detail")
        val imageResId = intent.getIntExtra("imageResId", R.drawable.ship)

        findViewById<ImageView>(R.id.imageView).setImageResource(imageResId)
        findViewById<TextView>(R.id.textViewTitle).text = title
        findViewById<TextView>(R.id.textViewDetails).text = details
    }
}
