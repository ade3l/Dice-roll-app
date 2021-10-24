package com.example.diceapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val resultTextView : TextView = findViewById(R.id.textView)
        val dice=Dice(6)
        rollButton.setOnClickListener{
            resultTextView.setText(dice.roll().toString())
        }
    }

    class Dice(numSide:Int) {
        val side=numSide
        fun roll():Int{
            return ((1..side).random())
        }
    }
}