package com.example.diet_memo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.lang.Exception

class SplashActivity3 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash3)
        auth = Firebase.auth

        Log.d("Splash","0번상황")
        try{
            Toast.makeText(this, "이미 로그인 돼있음",
                Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }, 3000)
            Log.d("Splash","1번상황")
        }catch (e : Exception){
            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "비회원 로그인 성공",
                            Toast.LENGTH_SHORT).show()
                        Handler().postDelayed({
                            startActivity(Intent(this,MainActivity::class.java))
                            finish()
                        }, 3000)
                        Log.d("Splash","2번상황")
                    } else {
                        Toast.makeText(this, "비회원 로그인 실패",
                            Toast.LENGTH_SHORT).show()
                        Log.d("Splash","3번상황")
                    }
                }
        }
    }
}