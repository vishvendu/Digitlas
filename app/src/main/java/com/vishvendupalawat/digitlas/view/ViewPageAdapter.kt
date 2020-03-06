package com.vishvendupalawat.digitlas.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {




    // inflate the fragment as per the position
    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> {
                MovieFragment()
            }
            1-> {
                MovieFragment()
            }
            2-> {
                MovieFragment()
            }
            3 -> {
                MovieFragment()
            }
            else -> {
                MovieFragment()
            }
        }

    }

    // return the number of tab we need
    override fun getCount(): Int {
            return 5;
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->{
                            "MOVIES"
            }
            1 -> {
                            "TV Shows"
            }
            2 -> {
                            "People"
            }
            3 -> {
                            "Search"
            }
            else -> {
                            "Profile"
            }
        }
    }
}