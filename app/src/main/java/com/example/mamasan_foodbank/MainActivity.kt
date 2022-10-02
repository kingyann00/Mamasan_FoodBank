package com.example.mamasan_foodbank

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mamasan_foodbank.replenishment_reservation.replenishment_reservation_list
import com.example.mamasan_foodbank.replenishment_reservation.replenishment_reservation_search
import com.google.gson.Gson
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    private val URL: String ="http://10.0.2.2/mamasan/foodType.php"
    lateinit var foodTypeList: ArrayList<FoodType>
    var gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,replenishment_search::class.java)
        startActivity(intent)
    }


}