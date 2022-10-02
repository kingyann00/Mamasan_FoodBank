package com.example.mamasan_foodbank

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class replenishment_detail : Fragment() {

    companion object {
        fun newInstance() = replenishment_detail()
    }

    private lateinit var viewModel: ReplenishmentDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_replenishment_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReplenishmentDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}