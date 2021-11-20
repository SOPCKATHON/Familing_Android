package com.sopt.familing.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sopt.familing.R
import com.sopt.familing.databinding.ActivityPostWriteBinding

class PostWriteActivity : AppCompatActivity() {
    private var isChipSelected : Int = -1
    private lateinit var binding : ActivityPostWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPostWriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



    private fun initChipSListener(){
        // 외식
        binding.chip0.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.chip0.isChecked = true
            isChipSelected = 0

        }

        binding.chip1.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.chip1.isChecked = true
            isChipSelected = 1
        }

        binding.chip2.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.chip2.isChecked = true
            isChipSelected = 2
        }

        binding.chip3.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.chip3.isChecked = true
            isChipSelected = 3
        }

        binding.chip4.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.chip3.isChecked = true
            isChipSelected = 3
        }
    }

    // 등록 버튼을 누르면 chip group 중 몇번 chip이 선택되었는지에 따라 서버에 정보 전달할 때 카테고리 정수값 전달
    /*
    View.OnClickListener {
            binding.cgChip.clearCheck()
            chip.isChecked = true
        }
     */



    companion object{
        const val FIRST_CATEGORY = 0
    }
}