package com.example.mamasan_foodbank

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodListBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentInformationBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentSearchingBinding
import com.example.mamasan_foodbank.ui.main.PageViewModel
import com.example.mamasan_foodbank.ui.main.PlaceholderFragment

class replenishment_food_list : Fragment() {

    companion object {
        fun newInstance() = replenishment_food_list()
    }

    private lateinit var viewModel: ReplenishmentFoodListViewModel
    private var FoodList = ArrayList<FoodData>()

    lateinit var foodName: Array<String>
    lateinit var foodType: Array<String>
    lateinit var SKU: Array<String>
    lateinit var skuQuantity: Array<Int>
    lateinit var quantity: Array<Int>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var _binding: FragmentReplenishmentFoodListBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReplenishmentFoodListBinding.inflate(inflater, container, false)
        val root = _binding.root
//        dataIntialize()

        val recyclerView: RecyclerView = _binding.recyclerFoodList
        foodAdapter= FoodAdapter(FoodList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = foodAdapter
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)





    }

}