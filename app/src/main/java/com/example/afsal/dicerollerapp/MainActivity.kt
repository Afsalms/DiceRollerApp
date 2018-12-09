package com.example.afsal.dicerollerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    var image : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image = findViewById(R.id.image_view)
        image?.setOnClickListener(View.OnClickListener {
            rollDice()
        })

    }

    fun rollDice(){

        var randInt = Random.nextInt(1,7)
        when(randInt){
            1 -> {image?.setImageResource(R.drawable.dice_one)}
            2 -> {image?.setImageResource(R.drawable.dice_two)}
            3 -> {image?.setImageResource(R.drawable.dice_three)}
            4 -> {image?.setImageResource(R.drawable.dice_four)}
            5 -> {image?.setImageResource(R.drawable.dice_five)}
            6 -> {image?.setImageResource(R.drawable.dice_six)}

        }
    }
}
