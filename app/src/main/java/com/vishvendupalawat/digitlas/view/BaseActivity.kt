package com.vishvendupalawat.digitlas.view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.vishvendupalawat.digitlas.R

abstract class BaseActivity : AppCompatActivity() {

    private var progressBar : ProgressBar? = null;
    private lateinit var toolbar : Toolbar
    private lateinit var mContext : Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
    }

     fun initToolbar(){
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    fun setTitleToolbar(mTitle : String){ supportActionBar?.title = mTitle }

    fun setProgressBar (resID : Int){ progressBar = findViewById(resID) }

    fun showProgressBar(){ progressBar?.visibility = View.VISIBLE }

     fun hideProgressBar(){ progressBar?.visibility = View.INVISIBLE }


    abstract fun getContentView(): Int


}