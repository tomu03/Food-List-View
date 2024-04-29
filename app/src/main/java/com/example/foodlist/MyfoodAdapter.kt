package com.example.foodlist

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyfoodAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val desc: Array<String>,
    private val imageId: Array<Int>
) : ArrayAdapter<String>(context,R.layout.listfood, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val conInFlater = context.layoutInflater
        val rowView = conInFlater.inflate(R.layout.listfood, parent, false)

        val titelTxt = rowView.findViewById<TextView>(R.id.foodName)
        val desctxt = rowView.findViewById<TextView>(R.id.foodDetalis)
        val image = rowView.findViewById<ImageView>(R.id.foodImg)

        titelTxt.text = title[position]
        desctxt.text = desc[position]
        image.setImageResource(imageId[position])

        return rowView

    }
}