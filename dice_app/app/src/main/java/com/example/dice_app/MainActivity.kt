package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val Image1 = binding.image1
        val Image2 = binding.image2

        binding.diceStartBtn.setOnClickListener{
            Toast.makeText(this,"움직입니당",Toast.LENGTH_LONG).show()

            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            if(number1==1){
                Image1.setImageResource(R.drawable.yd1)
            }else if(number1==2){
                Image1.setImageResource(R.drawable.yd2)
            }else if(number1==3){
                Image1.setImageResource(R.drawable.yd3)
            }else if(number1==4){
                Image1.setImageResource(R.drawable.yd4)
            }else if(number1==5){
                Image1.setImageResource(R.drawable.yd5)
            }else if(number1==6){
                Image1.setImageResource(R.drawable.yd6)
            }else if(number1==7){
                Image1.setImageResource(R.drawable.yd7)
            }else {
                Image1.setImageResource(R.drawable.yd8)
            }

            if(number2==1){
                Image2.setImageResource(R.drawable.yd1)
            }else if(number2==2){
                Image2.setImageResource(R.drawable.yd2)
            }else if(number2==3){
                Image2.setImageResource(R.drawable.yd3)
            }else if(number2==4){
                Image2.setImageResource(R.drawable.yd4)
            }else if(number2==5){
                Image2.setImageResource(R.drawable.yd5)
            }else if(number2==6){
                Image2.setImageResource(R.drawable.yd6)
            }else if(number2==7){
                Image2.setImageResource(R.drawable.yd7)
            }else {
                Image2.setImageResource(R.drawable.yd8)
            }
        }
    }
}