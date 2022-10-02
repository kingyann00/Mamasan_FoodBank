package com.example.mamasan_foodbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mamasan_foodbank.databinding.ActivityReplenishmentCreateBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding

class replenishment_create : AppCompatActivity() {
    lateinit var binding: ActivityReplenishmentCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReplenishmentCreateBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

    }
}