package com.example.onboardingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        startSecondActivity()
    }

    fun startSecondActivity(){
        if(!isDestroyed){
            val intent = Intent(this,SignIn::class.java) // specify the intent to go to the activity
            val tmtask = timerTask {
                if(!isDestroyed){
                    startActivity(intent)
                    finish()
                }
            }
            val timer = Timer()
            timer.schedule(tmtask,3000)

        }
    }
}