package com.example.garbage_gallery

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //화면이 클릭됨을 인지
        val image1 = findViewById<ImageView>(R.id.garbage_image1)
        image1.setOnClickListener{
            Toast.makeText(this,"뱅차니 클릭 완료",Toast.LENGTH_LONG).show()

            //클릭을 인지한 경우, 다음 화면으로 넘어가 사진을 크게 키움
            val intent = Intent(this, Garbage1Activity::class.java)
            startActivity(intent) //intent를 실행한다.
        }

        val image2 = findViewById<ImageView>(R.id.garbage_image2)
        image2.setOnClickListener{
            Toast.makeText(this,"아기종수 클릭 완료",Toast.LENGTH_LONG).show()

            //클릭을 인지한 경우, 다음 화면으로 넘어가 사진을 크게 키움
            val intent = Intent(this, Garbage2Activity::class.java)
            startActivity(intent) //intent를 실행한다.
        }

        val image3 = findViewById<ImageView>(R.id.garbage_image3)
        image3.setOnClickListener{
            Toast.makeText(this,"빵중이 클릭 완료",Toast.LENGTH_LONG).show()

            //클릭을 인지한 경우, 다음 화면으로 넘어가 사진을 크게 키움
            val intent = Intent(this, Garbage3Activity::class.java)
            startActivity(intent) //intent를 실행한다.
        }

        val image4 = findViewById<ImageView>(R.id.garbage_image4)
        image4.setOnClickListener {
            Toast.makeText(this, "아기상호 클릭 완료", Toast.LENGTH_LONG).show()

            //클릭을 인지한 경우, 다음 화면으로 넘어가 사진을 크게 키움
            val intent = Intent(this, Garbage4Activity::class.java)
            startActivity(intent) //intent를 실행한다.
        }
    }
}