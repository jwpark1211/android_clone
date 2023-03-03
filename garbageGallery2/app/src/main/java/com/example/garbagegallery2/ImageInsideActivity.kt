package com.example.garbagegallery2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)
        val getData = intent.getStringExtra("data")
        val memberImageId = findViewById<ImageView>(R.id.memberImageArea)
       // Toast.makeText(this,getData,Toast.LENGTH_LONG).show()

        if(getData=="1")
            memberImageId.setImageResource(R.drawable.yd_1)
        if(getData=="2")
            memberImageId.setImageResource(R.drawable.yd_2)
        if(getData=="3")
            memberImageId.setImageResource(R.drawable.yd_3)
        if(getData=="4")
            memberImageId.setImageResource(R.drawable.yd_4)
        if(getData=="5")
            memberImageId.setImageResource(R.drawable.yd_5)
        if(getData=="6")
            memberImageId.setImageResource(R.drawable.yd_6)
        if(getData=="7")
            memberImageId.setImageResource(R.drawable.yd_7)
        if(getData=="8")
            memberImageId.setImageResource(R.drawable.yd_8)
    }
}