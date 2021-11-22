package com.sopt.familing.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.sopt.familing.R
import com.sopt.familing.databinding.FragmentWriteFamilyBinding

class WriteFamilyFragment : Fragment() {
    private var _binding: FragmentWriteFamilyBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentWriteFamilyBinding.inflate(layoutInflater,container,false)

        initEditText()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initEditText(){
        binding.editFamily.addTextChangedListener {
            binding.btnOk.isEnabled = !binding.editFamily.text.isNullOrBlank()
        }
    }
}