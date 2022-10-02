package com.example.mamasan_foodbank.replenishment_reservation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mamasan_foodbank.R

class replenishment_reservation_search : Fragment() {

    companion object {
        fun newInstance() = replenishment_reservation_search()
    }

    private lateinit var viewModel: ReplenishmentReservationSearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_replenishment_reservation_search,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReplenishmentReservationSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}