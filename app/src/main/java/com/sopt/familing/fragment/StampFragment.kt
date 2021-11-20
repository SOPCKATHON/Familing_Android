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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentStampBinding.inflate(layoutInflater,container,false)
        initFamilyName()

        return binding.root
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