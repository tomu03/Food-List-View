package com.example.foodlist

import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


lateinit var foodView: ListView

val argfoodName = arrayOf(
    "Pizza", "Burger", "Taco", "Hot Dog", "Milkshake", "Fries", "Sandwich", "Roast chicken", "Steak"
)

val argfoodDetails = arrayOf(
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",
    "Fast food item",

    )

val argfoodImg = arrayOf(
    R.drawable.pizza,
    R.drawable.burger,
    R.drawable.taco,
    R.drawable.hot_dog,
    R.drawable.milkshake,
    R.drawable.fries,
    R.drawable.sandwich,
    R.drawable.roast_chicken,
    R.drawable.steak
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        foodView = findViewById(R.id.listView)

        var MyfoodAdapter = myfoodAdapter(this, argfoodName, argfoodDetails, argfoodImg)

        foodView.adapter = MyfoodAdapter
        foodView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(
                this,
                "Food Item Clicked${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            )


        }

    }
}