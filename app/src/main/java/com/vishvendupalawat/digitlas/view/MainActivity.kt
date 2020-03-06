package com.vishvendupalawat.digitlas.view

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.vishvendupalawat.digitlas.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    private lateinit var  viewPager : ViewPager
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initToolbar()
        setTitleToolbar("DIGITLAs")

        viewPager = findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tabs)

        val pageAdapter = ViewPageAdapter(supportFragmentManager)
        viewPager.adapter = pageAdapter
        tabLayout.setupWithViewPager(viewPager)

    }


    override fun getContentView(): Int {
        return R.layout.activity_main
    }



}





