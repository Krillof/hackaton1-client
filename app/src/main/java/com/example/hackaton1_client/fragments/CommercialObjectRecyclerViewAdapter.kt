package com.example.hackaton1_client.fragments

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hackaton1_client.data.CommercialObject
import com.example.hackaton1_client.databinding.FragmentCommercialObjectBinding

import com.example.hackaton1_client.fragments.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class CommercialObjectRecyclerViewAdapter(
    private val values: List<CommercialObject>
) : RecyclerView.Adapter<CommercialObjectRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentCommercialObjectBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        //
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentCommercialObjectBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

}