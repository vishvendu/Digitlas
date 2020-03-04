package com.vishvendupalawat.digitlas.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPageAdapter(fragmentmanager : FragmentManager) : FragmentPagerAdapter(fragmentmanager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {




    //
    override fun getItem(position: Int): Fragment {

    }

    // return the number of tab we need
    override fun getCount(): Int {

    }
}