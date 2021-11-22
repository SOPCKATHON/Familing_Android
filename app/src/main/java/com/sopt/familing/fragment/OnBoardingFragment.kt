package com.sopt.familing.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.familing.R
import com.sopt.familing.databinding.FragmentOnBoardingBinding
import com.sopt.familing.databinding.FragmentStampBinding

class OnBoardingFragment : Fragment() {
    private var _binding: FragmentOnBoardingBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentOnBoardingBinding.inflate(layoutInflater,container,false)


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}