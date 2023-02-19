package com.example.hackaton1_client.fragments

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hackaton1_client.data.Building
import com.example.hackaton1_client.databinding.FragmentBuildingBinding
import com.example.hackaton1_client.network.placeholder.PlaceholderContent.PlaceholderItem
import com.example.hackaton1_client.network.NetworkQueries

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class BuildingsRecyclerViewAdapter(
    private val values: List<Building>
) : RecyclerView.Adapter<BuildingsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentBuildingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        //"m²"
        with(holder.binding){
            NetworkQueries.setBuildingPicture(item, imageView)
            header.text = item.name_build
            addressHeader.text = item.address
            square.text = "2000m²" // TODO: change
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(val binding: FragmentBuildingBinding)
        : RecyclerView.ViewHolder(binding.root) {}

}