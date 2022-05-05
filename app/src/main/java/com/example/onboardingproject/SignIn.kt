package com.example.onboardingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        supportActionBar?.hide()

        val skipButton = findViewById<Button>(R.id.skipButton)
        skipButton.setOnClickListener {
            val intent  = Intent(this, PickSports::class.java)
            startActivity(intent)
        }
    }
}