package com.example.mamasan_foodbank.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mamasan_foodbank.R
import com.example.mamasan_foodbank.Replenishment
import com.example.mamasan_foodbank.ReplenishmentAdapter
import com.example.mamasan_foodbank.databinding.FragmentReplenishmentListBinding

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {
    private var replenishmentList = ArrayList<Replenishment>()
    private lateinit var replenishmentAdapter : ReplenishmentAdapter
    lateinit var replenishmentImg: Array<Int>
    lateinit var replenishmentTitle: Array<String>
    lateinit var location: Array<String>
    lateinit var replenishment_dateTime: Array<String>



    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentReplenishmentListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentReplenishmentListBinding.inflate(inflater, container, false)
        val root = binding.root

        val textView: TextView = binding.sectionLabel




        pageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
            dataIntialize()
            val recyclerView: RecyclerView = _binding!!.RecyclerReplenishmentList
            replenishmentAdapter= ReplenishmentAdapter(replenishmentList)
            val layoutManager = LinearLayoutManager(context)
            recyclerView.layoutManager = layoutManager

            recyclerView.adapter = replenishmentAdapter
        })
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //prepareItems()





    }
    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
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
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}