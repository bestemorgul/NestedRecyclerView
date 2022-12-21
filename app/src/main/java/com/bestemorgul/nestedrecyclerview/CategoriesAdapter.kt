package com.bestemorgul.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(private val categoriesList: List<Categories>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    inner class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logoIv: ImageView = itemView.findViewById(R.id.categoriesLogo)
        val titleTv: TextView = itemView.findViewById(R.id.categoriesTitle)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.moviesRV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.categories_item_design, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val parentItem = categoriesList[position]
        holder.logoIv.setImageResource(parentItem.logo)
        holder.titleTv.text = parentItem.title

        holder.childRecyclerView.setHasFixedSize(true)
        holder.childRecyclerView.layoutManager = GridLayoutManager(holder.itemView.context, 4)
        val adapter = MoviesAdapter(parentItem.mList)
        holder.childRecyclerView.adapter = adapter
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}