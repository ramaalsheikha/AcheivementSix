package com.example.acheivementsix.data.api

import retrofit2.http.GET

interface IProjectApi {
    @GET("/achievements")
    fun getAchievements(){

    }
}