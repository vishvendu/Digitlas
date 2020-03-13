package com.vishvendupalawat.digitlas.view

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_master.Model.UpcomingMovieResponse
import com.squareup.picasso.Picasso
import com.vishvendupalawat.digitlas.R
import kotlinx.android.synthetic.main.upcoming_movie_item_list.view.*

class UpcomingMovieRecyclerAdapter(upcomingmovie : ArrayList<UpcomingMovieResponse>) : RecyclerView.Adapter<UpcomingMovieRecyclerAdapter.UpcomingMovieViewHolder>() {

    private lateinit var mUpcomingMovieList : ArrayList<UpcomingMovieResponse>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMovieViewHolder {
        // inflate layout here
        return UpcomingMovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.upcoming_movie_item_list,parent,false)
        )

    }

    override fun onBindViewHolder(holder: UpcomingMovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return mUpcomingMovieList.size
    }

    class UpcomingMovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val movie_image : ImageView = itemView.imageview

        fun bind(upcomingMovieResponse: UpcomingMovieResponse){

            Picasso.with(context).load(imageUri).into(upcomingMovieResponse.results.);
        }

    }

}