package com.sopt.familing.activity

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.sopt.familing.R

class SplashActivity : AppCompatActivity() {
    val SPLASH_VIEW_TIME: Long = 1000 //2초간 스플래시 화면을 보여줌 (ms)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({ //delay를 위한 handler
            if(CheckAppFirstExecute()) {
                Intent(this, OnBoardingActivity::class.java).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run { startActivity(this) }
            }else{
                Intent(this, HomeActivity::class.java).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run { startActivity(this) }
            }
            finish()
        }, SPLASH_VIEW_TIME)

//        Handler(Looper.getMainLooper()).postDelayed({
//            val intent= Intent(this,OnBoardingActivity::class.java)
//            startActivity(intent)
//            finish()
//        },100) //1초가 1000millis
//        //TODO : 나중에 초 변경
    }

    fun CheckAppFirstExecute():Boolean{
        var pref: SharedPreferences = getSharedPreferences("IsFirst" , Activity.MODE_PRIVATE);
        var isFirst:Boolean = pref.getBoolean("isFirst", false);
        if(!isFirst){ //최초 실행시 true 저장
            var editor: SharedPreferences.Editor = pref.edit();
            editor.putBoolean("isFirst", true);
            editor.commit();
        }

        return !isFirst;
    }
}