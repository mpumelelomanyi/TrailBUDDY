package com.trailbuddyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrailListAdapter(private val trails: List<Trail>) : RecyclerView.Adapter<TrailListAdapter.TrailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trail, parent, false)
        return TrailViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrailViewHolder, position: Int) {
        val trail = trails[position]
        holder.trailName.text = trail.name
        holder.trailDescription.text = trail.description
    }

    override fun getItemCount(): Int {
        return trails.size
    }

    class TrailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val trailName: TextView = itemView.findViewById(R.id.trail_name)
        val trailDescription: TextView = itemView.findViewById(R.id.trail_description)
    }
}
