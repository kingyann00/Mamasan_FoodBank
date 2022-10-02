package com.example.mamasan_foodbank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentFoodBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentInformationBinding


/**
 * A simple [Fragment] subclass.
 * Use the [replenishment_information.newInstance] factory method to
 * create an instance of this fragment.
 */
class replenishment_information : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var _binding: FragmentReplenishmentInformationBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReplenishmentInformationBinding.inflate(inflater, container, false)
        val root = binding.root

        _binding.replenishmentTitleCard.setOnClickListener{
            if (_binding.replenishmentInformationCard.isVisible == true)
                _binding.replenishmentInformationCard.isVisible = false
            else
                _binding.replenishmentInformationCard.isVisible = true
        }
        return root
    }

}