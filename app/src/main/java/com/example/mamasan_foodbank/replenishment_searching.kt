package com.example.mamasan_foodbank

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.databinding.ActivityReplenishmentSearchBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentListBinding
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentSearchingBinding

class replenishment_searching : Fragment() {
    private var replenishmentList = ArrayList<Replenishment>()
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
        dataIntialize()
        val recyclerView: RecyclerView = _binding.RecyclerReplenishmentList
        replenishmentAdapter= ReplenishmentAdapter(replenishmentList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = replenishmentAdapter
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReplenishmentSearchingViewModel::class.java)

    }
    private fun dataIntialize() {


        replenishmentTitle = arrayOf(
            "Food 1", "Food 2", "Food 3", "Food 4", "Food 6", "Food 5"
        )

        location = arrayOf(
            "Frozen Food",
            "Frozen Food",
            "Dry Food",
            "Frozen Food",
            "Frozen Food",
            "Frozen Food"
        )

        replenishment_dateTime = arrayOf(
            "Sat, Sep 24, 11:06 AM","Sat, Sep 24, 11:06 AM","Sat, Sep 24, 11:06 AM","Sat, Sep 24, 11:06 AM","Sat, Sep 24, 11:06 AM","Sat, Sep 24, 11:06 AM"
        )
        replenishmentImg = arrayOf(
            R.drawable.campaign_img_test,
            R.drawable.campaign_img_test,
            R.drawable.campaign_img_test,
            R.drawable.campaign_img_test,
            R.drawable.campaign_img_test,
            R.drawable.campaign_img_test
        )



        replenishmentList = ArrayList()
        for (i in replenishmentTitle.indices) {
            val replenishment = Replenishment(
                replenishmentImg[i],
                replenishmentTitle[i],
                location[i],
                replenishment_dateTime[i],

                )
            replenishmentList.add(replenishment)

        }
    }

}