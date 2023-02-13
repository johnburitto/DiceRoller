package com.johnburitto.diceroller

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

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        val dice = Dice(6)
        val resultTextView : TextView = findViewById(R.id.textView)

        resultTextView.text = dice.roll().toString();
    }
}