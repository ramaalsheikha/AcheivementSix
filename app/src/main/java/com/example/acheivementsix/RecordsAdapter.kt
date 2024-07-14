package com.example.acheivementsix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.acheivementsix.data.model.RecordsModel
import com.example.acheivementsix.databinding.AchievementItemBinding
import com.example.acheivementsix.databinding.ModelItemBinding

class RecordsAdapter (private val list:List<RecordsModel>):RecyclerView.Adapter<RecordsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ModelItemBinding.inflate(inflater,parent,false)
        return RecordsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        holder.bind(list[position])
    }
}