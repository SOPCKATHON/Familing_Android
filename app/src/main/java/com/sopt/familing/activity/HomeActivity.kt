package com.sopt.familing.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.sopt.familing.R
import com.sopt.familing.adapter.ViewPagerAdapter
import com.sopt.familing.databinding.ActivityHomeBinding
import com.sopt.familing.fragment.MyPageFragment
import com.sopt.familing.fragment.StampFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        initAdapter()
        initBottomNavigation()
        initPostWriteListener()

        setContentView(binding.root)
    }

    private fun initPostWriteListener() {
        binding.fabPost.setOnClickListener{
            val intent = Intent(this@HomeActivity, PostWriteActivity::class.java)
            startActivity(intent)
        }

    }

    private fun initBottomNavigation() {
        binding.vpHome.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                binding.bnv.menu.getItem(position).isChecked = true
            }
        })

        binding.bnv.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_stamp -> {
                    binding.vpHome.currentItem = STAMP_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                else -> {
                    binding.vpHome.currentItem = MY_PAGE_FRAGMENT
                    return@setOnItemSelectedListener true
                }
            }
        }
    }

    private fun initAdapter() {
        val fragmentList = listOf(StampFragment(), MyPageFragment())

        viewPagerAdapter = ViewPagerAdapter(this)
        viewPagerAdapter.fragments.addAll(fragmentList)

        binding.vpHome.adapter = viewPagerAdapter
    }

    companion object {
        const val STAMP_FRAGMENT = 0
        const val MY_PAGE_FRAGMENT = 1
    }
}