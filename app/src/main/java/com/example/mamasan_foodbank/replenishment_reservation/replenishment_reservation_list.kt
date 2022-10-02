package com.example.mamasan_foodbank.replenishment_reservation


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.mamasan_foodbank.R
import com.example.mamasan_foodbank.databinding.ActivityReplenishmentReservationListBinding
import com.example.mamasan_foodbank.replenishment_reservation.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout


class replenishment_reservation_list : AppCompatActivity() {

    private lateinit var binding: ActivityReplenishmentReservationListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReplenishmentReservationListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

    }
}