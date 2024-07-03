package com.example.acheivementsix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.data.repository.Repository

class MainViewModel:ViewModel() {
    private val repository = Repository()
    private val achievementSuccessLivedata:MutableLiveData<AchievementResponseModel> = MutableLiveData()

   fun getAchievements(){
       val response = repository.getAchievements()
       achievementSuccessLivedata.postValue(response)
   }
}