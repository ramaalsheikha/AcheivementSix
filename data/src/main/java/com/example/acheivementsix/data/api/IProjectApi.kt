package com.example.acheivementsix.data.api

import com.example.acheivementsix.data.model.WrappedAchievementResponseModel
import retrofit2.http.GET

interface IProjectApi {
    @GET("/achievements")
    suspend fun getAchievements(): WrappedAchievementResponseModel
}