package com.example.mamasan_foodbank

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.mamasan_foodbank.databinding.FragmentReplenishmentListBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentSearchingBinding

class replenishment_searching : Fragment(),OnReplenishmentClickListener {
    private var replenishmentList = ArrayList<DataReplenishments>()
    private  var replenishment = ArrayList<DataReplenishments>()
    private lateinit var replenishmentAdapter : ReplenishmentAdapter
    lateinit var replenishmentImg: Array<Int>
    lateinit var replenishmentTitle: Array<String>
    lateinit var location: Array<String>
    lateinit var replenishment_dateTime: Array<String>
    private lateinit var _binding: FragmentReplenishmentSearchingBinding
    companion object {
        fun newInstance() = replenishment_searching()
    }

    private lateinit var viewModel: ReplenishmentSearchingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentReplenishmentSearchingBinding.inflate(inflater, container, false)
        val root = _binding.root

        val recyclerView: RecyclerView = _binding.RecyclerReplenishmentList
        replenishmentAdapter= ReplenishmentAdapter(replenishmentList,this)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = replenishmentAdapter
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReplenishmentSearchingViewModel::class.java)

    }

    override fun onRelenishmentClicked(position: Int) {
        Toast.makeText(context,"Replenishment"+position+" Clicked",Toast.LENGTH_LONG).show()
    }

}