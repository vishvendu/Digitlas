package com.vishvendupalawat.digitlas.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_master.Model.UpcomingMovieResponse

class UpcomingMovieRecyclerAdapter(upcomingmovie : ArrayList<UpcomingMovieResponse>) : RecyclerView.Adapter<UpcomingMovieRecyclerAdapter.UpcomingMovieViewHolder>() {

    private lateinit var mUpcomingMovieList : ArrayList<UpcomingMovieResponse>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMovieViewHolder {
        // inflate layout here


    }

    override fun onBindViewHolder(holder: UpcomingMovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return mUpcomingMovieList.size
    }

    class UpcomingMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    }

}