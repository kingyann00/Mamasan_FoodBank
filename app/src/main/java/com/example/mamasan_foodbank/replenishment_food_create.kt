package com.example.mamasan_foodbank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodCreateBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private lateinit var viewModel: ReplenishmentFoodListViewModel
private var FoodList = ArrayList<FoodData>()
lateinit var foodName: Array<String>
lateinit var foodType: Array<String>
lateinit var SKU: Array<String>
lateinit var skuQuantity: Array<Int>
lateinit var quantity: Array<Int>
private lateinit var foodAdapter: FoodAdapter
private lateinit var _binding: FragmentReplenishmentFoodCreateBinding
private val binding get() = _binding

class replenishment_food_create : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentReplenishmentFoodCreateBinding.inflate(inflater, container, false)
        val root = binding.root
        _binding.replenishmentTitleCard.setOnClickListener{
            if (_binding.replenishmentInformationCard.isVisible == true)
                _binding.replenishmentInformationCard.isVisible = false
            else
                _binding.replenishmentInformationCard.isVisible = true
        }



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
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment replenishment_food_create.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            replenishment_food_create().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}