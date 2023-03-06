package com.example.fb_firebase_email_auth

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
@SuppressLint("MissingInflatedId")
class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = Firebase.auth

        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener{
            val email = findViewById<EditText>(R.id.emailArea)
            val password = findViewById<EditText>(R.id.passwordArea)

            auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                       // val user = auth.currentUser
                        Toast.makeText(baseContext, "Authentication succeeded.",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener{
            val email = findViewById<EditText>(R.id.emailArea)
            val password = findViewById<EditText>(R.id.passwordArea)

            auth.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // val user = auth.currentUser
                        Toast.makeText(baseContext, "login succeeded.",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(baseContext, "login failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }

        val logoutBtn = findViewById<Button>(R.id.logoutBtn)
        logoutBtn.setOnClickListener{
            Firebase.auth.signOut()
            Toast.makeText(baseContext, "LogOut succeeded.",
                Toast.LENGTH_SHORT).show()
        }
    }
}