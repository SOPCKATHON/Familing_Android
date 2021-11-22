package com.sopt.familing.fragment

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.familing.databinding.FragmentStampBinding


class StampFragment : Fragment() {

    private var _binding: FragmentStampBinding?=null
    private val binding get()=_binding!!
    var curr_month = 11

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentStampBinding.inflate(layoutInflater,container,false)

        initFamilyName()
        initNetwork()
        initListener()


        return binding.root
    }

    private fun initNetwork(){
        // 11월 관련 통신 하기

    }


    private fun initListener(){
        binding.ivPrevMonth.setOnClickListener{
            // 지난달 데이터 받기
            Log.d("prevMonth", "prevMonth")
            curr_month -= 1
            if (curr_month < 1) curr_month = 12
            val month = curr_month.toString() + "월"
            binding.tvMonth.text = month
        }
        binding.ivNextMonth.setOnClickListener{
            // 다음달 데이터 받기
            Log.d("nextMonth", "nextMonth")
            curr_month += 1
            if (curr_month > 12) curr_month = 1
            val month = curr_month.toString() + "월"
            binding.tvMonth.text = month

        }
    }

    private fun initFamilyName(){

        val pref = context?.getSharedPreferences("family", 0)
        val family_name = pref?.getString("familyName","")
        Log.d("SharedPrefTest", family_name.toString())

        binding.tvFamilyTitle.text =family_name
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}