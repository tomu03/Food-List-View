package com.example.foodlist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodlist.R.id.foodImg
import com.example.foodlist.R.id.foodName

class foodDetailsActivity : AppCompatActivity() {


    lateinit var foodName: TextView
    lateinit var foodImg: ImageView
    lateinit var foodDes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        foodName = findViewById(R.id.foodName)
        foodImg = findViewById(R.id.foodImg)
        foodDes = findViewById(R.id.sFoodDetalis)

        var name = intent.getStringExtra("name")
        var img = intent.getIntExtra("image", R.drawable.pizza)
        var desc = intent.getStringExtra("longdesc")

        foodDes.text = desc
        foodName.text = name
        foodImg.setImageResource(img)
    }
}
