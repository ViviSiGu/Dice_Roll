//Viviana Yineth Sierra Guzmán.
//App for dice roll
package com.dice_roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Roll_Button.setOnClickListener {
            dice_roll()
        }
    }


    private fun dice_roll()
    {
        val random_dice = (1..6).random()
        val image_dice: Int
        
        when(random_dice)
        {
            1->
            { image_dice = R.drawable.dice_1 }

            2->
            { image_dice = R.drawable.dice_2_ }


            3->
            { image_dice = R.drawable.dice_3 }

            4->
            { image_dice = R.drawable.dice_4 }

            5->
            { image_dice = R.drawable.dice_5 }
            
            else ->
            { image_dice = R.drawable.dice_6 }
        }

        Img_Dice.setImageResource(image_dice)
        Toast.makeText(this,"Rolled dice !",Toast.LENGTH_SHORT).show()
    }
}


