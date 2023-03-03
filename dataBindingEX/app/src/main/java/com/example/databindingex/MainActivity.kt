package com.example.databindingex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        /*1번 방식 - findViewById
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener{
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }*/

        //2번 방식 - DataBinding
        binding.testBtnId.setOnClickListener{
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }

        val test = "test"
        Log.d("MainActivity",test) //디버그
        Log.e("MainActivity",test) //오류
        Log.w("MainActivity",test) //경고
        Log.i("MainActivity",test) //정보
        Log.v("MainActivity",test) //상세

    }
}