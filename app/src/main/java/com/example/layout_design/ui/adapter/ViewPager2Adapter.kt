package com.example.layout_design.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.layout_design.ui.fragment.FragmentOne
import com.example.layout_design.ui.fragment.FragmentTwo

class ViewPager2Adapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentOne()
            }
            1 -> {
                FragmentTwo()
            }
            else -> {
                FragmentOne()
            }
        }
    }
}