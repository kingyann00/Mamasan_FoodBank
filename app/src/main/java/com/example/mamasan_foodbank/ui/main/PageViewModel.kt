package com.example.mamasan_foodbank.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mamasan_foodbank.DataReplenishments
import com.example.mamasan_foodbank.ReplenishmentAdapter
import com.google.gson.Gson

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()



    var dataReplenishments: ArrayList<DataReplenishments>


    var gson = Gson()
    init {
        dataReplenishments = ArrayList()
    }

    val text: LiveData<String> = Transformations.map(_index) {
        "Showing $it entries"
    }

     fun getDataCount()= "Showing "+dataReplenishments.size+1+" entries"
    fun setDataReplenishments(data: Array<DataReplenishments>){
        dataReplenishments.clear()

        for(i in 0..data.size-1){


            var replenishment_date_end: String
            if (data[i].replenishment_date_end != null)
                replenishment_date_end =  data[i].replenishment_date_end.toString()
            else
                replenishment_date_end = ""



            val replenishment = DataReplenishments(
                data[i].replenishment_id.toString(),
                data[i].replenishment_title.toString(),
                data[i].replenishment_description.toString(),
                data[i].replenishment_date_start.toString(),
                replenishment_date_end,
                data[i].location,
                data[i].status,
            )

            dataReplenishments.add(replenishment)


        }

    }
    fun setIndex(index: Int) {
        _index.value = index
    }


}