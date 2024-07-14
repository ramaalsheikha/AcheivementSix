package com.example.acheivementsix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.databinding.AchievementItemBinding

class AchievementsAdapter(val list: List<AchievementResponseModel>):RecyclerView.Adapter<AchievementViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AchievementItemBinding.inflate(inflater,parent,false)
        return AchievementViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        holder.bind(list[position])
    }
}