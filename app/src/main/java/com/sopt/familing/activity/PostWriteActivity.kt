package com.sopt.familing.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sopt.familing.R
import com.sopt.familing.databinding.ActivityOnBoardingBinding
import com.sopt.familing.databinding.ActivityPostWriteBinding

class PostWriteActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPostWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostWriteBinding.inflate(layoutInflater)



        setContentView(binding.root)
    }
}