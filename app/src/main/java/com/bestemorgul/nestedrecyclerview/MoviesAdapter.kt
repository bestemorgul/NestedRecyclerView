package com.bestemorgul.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(private val moviesList: List<Movies>) :
    RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    inner class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.moviesImg)
        val title: TextView = itemView.findViewById(R.id.moviesTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movies_item_design, parent, false)
        return MoviesViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.image.setImageResource(moviesList[position].image)
        holder.title.text = moviesList[position].title
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

}