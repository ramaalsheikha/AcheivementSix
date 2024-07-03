package com.example.acheivementsix.data.api

import com.example.acheivementsix.data.model.AchievementResponseModel
import retrofit2.http.GET

interface IProjectApi {
    @GET("/achievements")
    fun getAchievements():AchievementResponseModel
}