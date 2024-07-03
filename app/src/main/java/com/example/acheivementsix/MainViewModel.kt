package com.example.acheivementsix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acheivementsix.data.model.AchievementResponseModel
import com.example.acheivementsix.data.repository.Repository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    private val repository = Repository()
    val achievementSuccessLivedata:MutableLiveData<AchievementResponseModel> =  MutableLiveData()
    val achievementErrorLivedata:MutableLiveData<Exception> = MutableLiveData()

    init {
        getAchievements()
    }
   fun getAchievements(){
       viewModelScope.launch {
           try {
               delay(8000)
               val response = repository.getAchievements()
               achievementSuccessLivedata.postValue(response)
           }catch (e:Exception){
               achievementErrorLivedata.postValue(e)
           }

       }

   }
}