package com.example.garbagegallery2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.yd1)
        val btn2 = findViewById<ImageView>(R.id.yd2)
        val btn3 = findViewById<ImageView>(R.id.yd3)
        val btn4 = findViewById<ImageView>(R.id.yd4)
        val btn5 = findViewById<ImageView>(R.id.yd5)
        val btn6 = findViewById<ImageView>(R.id.yd6)
        val btn7 = findViewById<ImageView>(R.id.yd7)
        val btn8 = findViewById<ImageView>(R.id.yd8)

        btn1.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }
        btn4.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }
        btn5.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }
        btn6.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }
        btn7.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }
        btn8.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)
        }
    }
}