package com.sopt.familing.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.sopt.familing.R
import com.sopt.familing.adapter.ViewPagerAdapter
import com.sopt.familing.databinding.ActivityHomeBinding
import com.sopt.familing.databinding.ActivityOnBoardingBinding
import com.sopt.familing.fragment.MyPageFragment
import com.sopt.familing.fragment.StampFragment

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)

        binding.btnStart.setOnClickListener{
            val intent= Intent(this,WriteFamilyActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }


}