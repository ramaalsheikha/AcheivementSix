package com.example.acheivementsix

import androidx.recyclerview.widget.RecyclerView
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.data.model.RecordsModel
import com.example.acheivementsix.databinding.AchievementItemBinding
import com.example.acheivementsix.databinding.ModelItemBinding

class RecordsViewHolder(val binding: ModelItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun bind(model: RecordsModel){
            binding.model = model
        }
}
