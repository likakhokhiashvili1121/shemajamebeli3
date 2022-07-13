package com.example.shemajamebeli3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shemajamebeli3.databinding.LayoutSecondBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(val binding: LayoutSecondBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutSecondBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = stylesofFields[position]
        holder.binding.apply {
            icon.setImageResource(item.icon)
            main.text = item.main
        }

    }
    override fun getItemCount(): Int = stylesofFields.size
}