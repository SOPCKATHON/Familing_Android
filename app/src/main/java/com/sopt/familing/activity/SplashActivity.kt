package com.sopt.familing.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.sopt.familing.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        },3000) //1초가 1000millis
        //TODO : 나중에 초 변경
    }
}