package com.example.mamasan_foodbank

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.mamasan_foodbank.ui.main.SectionsPagerAdapter
import com.example.mamasan_foodbank.databinding.ActivityReplenishmentListBinding

class replenishment_list : AppCompatActivity() {

    private lateinit var binding: ActivityReplenishmentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReplenishmentListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        binding.searchBar.setOnClickListener{
                view->
            val intent = Intent(this,replenishment_search::class.java)
            startActivity(intent)
        }
    }
}