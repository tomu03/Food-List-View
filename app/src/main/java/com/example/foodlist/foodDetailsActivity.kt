package com.example.foodlist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class foodDetailsActivity : AppCompatActivity() {


    lateinit var sfoodName: TextView
    lateinit var sfoodImg: ImageView
    lateinit var sfoodDes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sfoodName = findViewById(R.id.sfoodName)
        sfoodImg = findViewById(R.id.sfoodImg)
        sfoodDes = findViewById(R.id.sfoodDes)

        var name = intent.getStringExtra("name")
        var img = intent.getIntExtra("image", R.drawable.pizza)
        var desc = intent.getStringExtra("longdesc")

        sfoodDes.text = desc
        sfoodName.text = name
        sfoodImg.setImageResource(img)
    }
}
