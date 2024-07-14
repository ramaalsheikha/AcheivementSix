package com.example.acheivementsix

import androidx.recyclerview.widget.RecyclerView
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.databinding.AchievementItemBinding

class AchievementViewHolder(private val binding: AchievementItemBinding) :RecyclerView.ViewHolder(binding.root){
    fun bind(achievementResponseModel: AchievementResponseModel) {
        binding.model = achievementResponseModel
        binding.rvAchievements.adapter = RecordsAdapter(achievementResponseModel.records)
    }
}