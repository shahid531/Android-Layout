package com.example.layout_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.layout_design.databinding.ActivityMainBinding
import com.example.layout_design.ui.adapter.ViewPager2Adapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewPager2Adapter: ViewPager2Adapter
    val tabList = listOf("One", "Two")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewPager2Adapter = ViewPager2Adapter(supportFragmentManager, lifecycle)
        binding.tabId.viewPager2.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabId.tabLayout, binding.tabId.viewPager2) { tab, index ->
            tab.text = tabList[index]
        }.attach()
    }
}