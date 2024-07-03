package com.example.acheivementsix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        initObserver()

    }

    private fun initObserver() {
        viewModel.achievementSuccessLivedata.observe(this) { response ->
            Toast.makeText(this, "Response $response", Toast.LENGTH_LONG).show()
        }

            viewModel.achievementErrorLivedata.observe(this) { exception ->
                Toast.makeText(this, "Error ${exception.localizedMessage}", Toast.LENGTH_LONG).show()

        }

    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}