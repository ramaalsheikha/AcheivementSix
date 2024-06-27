package com.example.acheivementsix.data.model

data class AchievementResponseModel(
    val id:Int ,
    val title:String,
    val label:String,
    val records:List<RecordsModel>
)
