package com.example.mamasan_foodbank

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodListBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentInformationBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentSearchingBinding

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
    private fun dataIntialize() {


        foodName = arrayOf(
            "Food 1", "Food 2", "Food 3", "Food 4", "Food 6", "Food 5"
        )

        foodType = arrayOf(
            "Frozen Food",
            "Frozen Food",
            "Dry Food",
            "Frozen Food",
            "Frozen Food",
            "Frozen Food"
        )

        quantity = arrayOf(
            15,20,25,30,25,35
        )
        skuQuantity = arrayOf(
            5,3,35,6,2,1
        )
        SKU = arrayOf(
            "ml","l","box", "kg","l","grams", "kg"
        )





        FoodList = ArrayList()
        for (i in foodName.indices) {
            val foodData = FoodData(
                foodName[i],
                foodType[i],
                SKU[i],
                "0",
                quantity[i],
                skuQuantity[i],
                )
            FoodList.add(foodData)

        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReplenishmentFoodListViewModel::class.java)

    }

}