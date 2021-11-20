package com.sopt.familing.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sopt.familing.databinding.ActivityPostWriteBinding

class PostWriteActivity : AppCompatActivity() {
    private var whatChipSelected : Int = -1
    private lateinit var binding : ActivityPostWriteBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostWriteBinding.inflate(layoutInflater)
        initChipListener()
        initCancelIvListener()
        setContentView(binding.root)
    }

    private fun initCancelIvListener(){
        binding.ivCancel.setOnClickListener{
            finish()
        }
    }


    private fun initChipListener(){
        // 외식
        binding.chip0.setOnClickListener {
            if(whatChipSelected == 0){
                binding.chip0.isSelected = false
                whatChipSelected = -1
            }
            else{
                binding.chip0.isSelected = true
                binding.chip1.isSelected = false
                binding.chip2.isSelected = false
                binding.chip3.isSelected = false
                binding.chip4.isSelected = false
                whatChipSelected = 0
            }
        }

        binding.chip1.setOnClickListener {
            if(whatChipSelected == 1){
                binding.chip1.isSelected = false
                whatChipSelected = -1
            }
            else {
                binding.chip0.isSelected = false
                binding.chip1.isSelected = true
                binding.chip2.isSelected = false
                binding.chip3.isSelected = false
                binding.chip4.isSelected = false
                whatChipSelected = 1
            }
        }

        binding.chip2.setOnClickListener {
            if(whatChipSelected == 2){
                binding.chip2.isSelected = false
                whatChipSelected = -1
            }
            else{
                binding.chip0.isSelected = false
                binding.chip1.isSelected = false
                binding.chip2.isSelected = true
                binding.chip3.isSelected = false
                binding.chip4.isSelected = false
                whatChipSelected = 2
            }
        }

        binding.chip3.setOnClickListener {
            if(whatChipSelected == 3){
                binding.chip3.isSelected = false
                whatChipSelected = -1
            }
            else {
                binding.chip0.isSelected = false
                binding.chip1.isSelected = false
                binding.chip2.isSelected = false
                binding.chip3.isSelected = true
                binding.chip4.isSelected = false
                whatChipSelected = 3
            }
        }

        binding.chip4.setOnClickListener {
            if(whatChipSelected == 4){
                binding.chip4.isSelected = false
                whatChipSelected = -1
            }
            else{
                binding.chip0.isSelected = false
                binding.chip1.isSelected = false
                binding.chip2.isSelected = false
                binding.chip3.isSelected = false
                binding.chip4.isSelected = true
                whatChipSelected = 4
            }
        }
    }


    companion object{
        const val FIRST_CATEGORY = 0
    }
}