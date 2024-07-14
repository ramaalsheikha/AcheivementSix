package com.example.acheivementsix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.acheivementsix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewModel()
        initObserver()

    }

    private fun initObserver() {
        viewModel.achievementSuccessLivedata.observe(this) { response ->
            binding.rvAchievements.adapter = AchievementsAdapter(response)
        }

            viewModel.achievementErrorLivedata.observe(this) { exception ->
                Toast.makeText(this, "Error ${exception.localizedMessage}", Toast.LENGTH_LONG).show()

        }

    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}