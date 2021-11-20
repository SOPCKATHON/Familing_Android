package com.sopt.familing.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.sopt.familing.databinding.ActivityOnBoardingBinding
import com.sopt.familing.databinding.ActivityWriteFamilyBinding

class WriteFamilyActivity : AppCompatActivity() {
    private lateinit var binding : ActivityWriteFamilyBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWriteFamilyBinding.inflate(layoutInflater)

        initEditText()
        initOkBtn()

        setContentView(binding.root)
    }

    private fun initEditText(){
        binding.editFamily.addTextChangedListener {
            binding.btnOk.isEnabled = !binding.editFamily.text.isNullOrBlank()
        }
    }

    private fun initOkBtn(){
        binding.btnOk.setOnClickListener{
            if(!binding.editFamily.text.isNullOrBlank()) {
                val familyName=binding.editFamily.text.toString()
                val sharedPreference = getSharedPreferences("family",0)
                val editor=sharedPreference.edit()
                editor.putString("familyName",familyName)
                editor.apply()
                Log.d("familyName", sharedPreference.getString("family","").toString())
                startActivity(intent)
            }

        }
    }
}