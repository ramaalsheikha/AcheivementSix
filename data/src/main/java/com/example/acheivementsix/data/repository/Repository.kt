package com.example.acheivementsix.data.repository

import com.example.acheivementsix.data.api.IProjectApi
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.data.network.RetrofitBuilder

class Repository {

    suspend fun getAchievements():List<AchievementResponseModel>{
        val achievementApi = RetrofitBuilder.getInstance().create(IProjectApi::class.java)
        return achievementApi.getAchievements()
    }
}