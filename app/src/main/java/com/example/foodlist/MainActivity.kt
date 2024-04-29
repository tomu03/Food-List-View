package com.example.foodlist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
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

    val argfoodImg = arrayOf<Int>(
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

    val argOfFoodDce = arrayOf(
        "Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy.",
        "Burger Roast chicken is chicken prepared as food by roasting whether in a home kitchen, over a fire, or with a rotisserie (rotary spit). Generally, the chicken is roasted with its own fat and juices by circulating the meat during roasting, and therefore, are usually cooked exposed to fire or heat with some type of rotary grill so that the circulation of these fats and juices is as efficient as possible. Roast chicken is a dish that appears in a wide variety of cuisines worldwide.0",
        "Taco  A steak is a thick cut of meat generally sliced across the muscle fibers, sometimes including a bone. It is normally grilled or fried. Steak can be diced, cooked in sauce, such as in steak and kidney pie, or minced and formed into patties, such as hamburgers. Steaks are cut from animals including cattle, bison, buffalo, camel, goat, horse, kangaroo, sheep, ostrich, pigs, turkey, and deer, as well as various types of fish, especially salmon and large fish such as swordfish, shark, and marlin. For some meats, such as pork, lamb and mutton, chevon, and veal, these cuts are often referred to as chops. Some cured meat, such as gammon, is commonly served as steak. Grilled portobello mushroom may be called mushroom steak, and similarly for other vegetarian dishes.Imitation steak is a food product that is formed into a steak shape from various pieces of meat. Grilled fruits such as watermelon have been used as vegetarian steak alternatives. Exceptions, in which the meat is sliced parallel to the fibers, include the skirt steak cut from the plate, the flank steak cut from the abdominal muscles, and the silverfinger steak cut from the loin and including three rib bones. In a larger sense, fish steaks, ground meat steaks, pork steak, and many more varieties of steak are known.In the United States, steak cut from cattle is also called 'beefsteak'.",
        "Hot dog A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy.",
        "Milkshake Roast chicken is chicken prepared as food by roasting whether in a home kitchen, over a fire, or with a rotisserie (rotary spit). Generally, the chicken is roasted with its own fat and juices by circulating the meat during roasting, and therefore, are usually cooked exposed to fire or heat with some type of rotary grill so that the circulation of these fats and juices is as efficient as possible. Roast chicken is a dish that appears in a wide variety of cuisines worldwide.0",
        "Fries A steak is a thick cut of meat generally sliced across the muscle fibers, sometimes including a bone. It is normally grilled or fried. Steak can be diced, cooked in sauce, such as in steak and kidney pie, or minced and formed into patties, such as hamburgers. Steaks are cut from animals including cattle, bison, buffalo, camel, goat, horse, kangaroo, sheep, ostrich, pigs, turkey, and deer, as well as various types of fish, especially salmon and large fish such as swordfish, shark, and marlin. For some meats, such as pork, lamb and mutton, chevon, and veal, these cuts are often referred to as chops. Some cured meat, such as gammon, is commonly served as steak. Grilled portobello mushroom may be called mushroom steak, and similarly for other vegetarian dishes.Imitation steak is a food product that is formed into a steak shape from various pieces of meat. Grilled fruits such as watermelon have been used as vegetarian steak alternatives. Exceptions, in which the meat is sliced parallel to the fibers, include the skirt steak cut from the plate, the flank steak cut from the abdominal muscles, and the silverfinger steak cut from the loin and including three rib bones. In a larger sense, fish steaks, ground meat steaks, pork steak, and many more varieties of steak are known.In the United States, steak cut from cattle is also called 'beefsteak'.",
        "A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy.",
        "Roast chicken is chicken prepared as food by roasting whether in a home kitchen, over a fire, or with a rotisserie (rotary spit). Generally, the chicken is roasted with its own fat and juices by circulating the meat during roasting, and therefore, are usually cooked exposed to fire or heat with some type of rotary grill so that the circulation of these fats and juices is as efficient as possible. Roast chicken is a dish that appears in a wide variety of cuisines worldwide.0",
        "A steak is a thick cut of meat generally sliced across the muscle fibers, sometimes including a bone. It is normally grilled or fried. Steak can be diced, cooked in sauce, such as in steak and kidney pie, or minced and formed into patties, such as hamburgers. Steaks are cut from animals including cattle, bison, buffalo, camel, goat, horse, kangaroo, sheep, ostrich, pigs, turkey, and deer, as well as various types of fish, especially salmon and large fish such as swordfish, shark, and marlin. For some meats, such as pork, lamb and mutton, chevon, and veal, these cuts are often referred to as chops. Some cured meat, such as gammon, is commonly served as steak. Grilled portobello mushroom may be called mushroom steak, and similarly for other vegetarian dishes.Imitation steak is a food product that is formed into a steak shape from various pieces of meat. Grilled fruits such as watermelon have been used as vegetarian steak alternatives. Exceptions, in which the meat is sliced parallel to the fibers, include the skirt steak cut from the plate, the flank steak cut from the abdominal muscles, and the silverfinger steak cut from the loin and including three rib bones. In a larger sense, fish steaks, ground meat steaks, pork steak, and many more varieties of steak are known.In the United States, steak cut from cattle is also called 'beefsteak'."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        foodView = findViewById(R.id.foodView)

        var myfoodAdapter = MyfoodAdapter(this, argfoodName, argfoodDetails, argfoodImg)

        foodView.adapter = myfoodAdapter
        foodView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(
                this,
                "Food Item Clicked${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this,foodDetailsActivity::class.java)
            intent.putExtra("name", argfoodName[position])
            intent.putExtra("image", argfoodImg[position])
            intent.putExtra("longdesc", argOfFoodDce[position])

            startActivity(intent)
        }
    }
}