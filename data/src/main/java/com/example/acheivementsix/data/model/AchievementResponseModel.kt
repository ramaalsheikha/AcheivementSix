package com.example.acheivementsix.data.model

import com.google.gson.annotations.SerializedName

data class AchievementResponseModel(
    @SerializedName("id")
    val achievementId:Int,
    val title:String,
    val label:String,
    val records:List<RecordsModel>
)
