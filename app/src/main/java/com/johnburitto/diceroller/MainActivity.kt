package com.johnburitto.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val diceImage: ImageView = findViewById(R.id.imageView)

        diceImage.setImageResource(getDiceImage(dice))
    }

    private fun getDiceImage(dice: Dice): Int {
        when (dice.roll()) {
            1 -> return R.drawable.dice_1
            2 -> return R.drawable.dice_2
            3 -> return R.drawable.dice_3
            4 -> return R.drawable.dice_4
            5 -> return R.drawable.dice_5
            6 -> return R.drawable.dice_6
        }

        return 0;
    }
}