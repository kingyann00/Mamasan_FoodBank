package com.example.mamasan_foodbank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [replenishment_food.newInstance] factory method to
 * create an instance of this fragment.
 */
class replenishment_food : Fragment() {

    private var replenishmentFoodList = ArrayList<ReplenishmentFood>()
    private lateinit var replenishmentFoodAdapter: ReplenishmentFoodAdapter

    lateinit var foodTitle: Array<String>
    lateinit var foodType: Array<String>
    lateinit var stok_quantity: Array<Int>
    lateinit var donate_quantity: Array<Int>
    lateinit var demand_quantity: Array<Int>
    private lateinit var _binding: FragmentReplenishmentFoodBinding
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentReplenishmentFoodBinding.inflate(inflater, container, false)
        val root = binding.root
        _binding.replenishmentFoodTitle.setOnClickListener{
            if (_binding.RecyclerReplenishmentFood.isVisible == true)
            _binding.RecyclerReplenishmentFood.isVisible = false
            else
                _binding.RecyclerReplenishmentFood.isVisible = true
        }

        dataIntialize()
        val recyclerView: RecyclerView = _binding.RecyclerReplenishmentFood
        replenishmentFoodAdapter= ReplenishmentFoodAdapter(replenishmentFoodList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = replenishmentFoodAdapter

        return root
    }
    private fun dataIntialize() {


        foodTitle = arrayOf(
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

        stok_quantity = arrayOf(
           15,20,25,30,25,35
        )
        donate_quantity = arrayOf(
            5,3,35,6,2,1
        )
        demand_quantity = arrayOf(
            30,35,50,40,27,35
        )



        replenishmentFoodList = ArrayList()
        for (i in foodTitle.indices) {
            val replenishmentFood = ReplenishmentFood(
                foodTitle[i],
                foodType[i],
                stok_quantity[i],
                donate_quantity[i],
                demand_quantity[i],

                )
            replenishmentFoodList.add(replenishmentFood)

        }
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment replenishment_food.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            replenishment_food().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}