package com.example.mamasan_foodbank

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReplenishmentFoodAdapter(val replenishmentFood: ArrayList<ReplenishmentFood>): RecyclerView.Adapter<ReplenishmentFoodAdapter.ViewHolder>() {
    override fun getItemCount()= replenishmentFood.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.foodTittle.text = replenishmentFood[position].foodTittle
        holder.foodType.text = replenishmentFood[position].foodType
        holder.stok_quantity.text = replenishmentFood[position].stok_quantity.toString()
        holder.donate_quantity.text = replenishmentFood[position].donate_quantity.toString()
        holder.demand_quantity.text = replenishmentFood[position].demand_quantity.toString()
        holder.stok_bar.setProgress(replenishmentFood[position].stok_quantity)
        holder.stok_bar.setMax(replenishmentFood[position].demand_quantity)
        val current = replenishmentFood[position].stok_quantity+replenishmentFood[position].donate_quantity

        if(replenishmentFood[position].stok_quantity == replenishmentFood[position].demand_quantity) {
            holder.progressBar.setProgress(1)
            holder.progressBar.setMax(1)

        }else if(current > replenishmentFood[position].demand_quantity){
            holder.max_donation_bar.setProgress(1)
            holder.max_donation_bar.setMax(1)

        }else{
        holder.donation_bar.setProgress(replenishmentFood[position].stok_quantity+replenishmentFood[position].donate_quantity)
        holder.donation_bar.setMax(replenishmentFood[position].demand_quantity)
        }






    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReplenishmentFoodAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.items_replenishment_food,parent, false)
        return  ViewHolder(view)
    }
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodTittle  : TextView = itemView.findViewById(R.id.foodTittle)
        val foodType  : TextView = itemView.findViewById(R.id.foodType)
        val stok_quantity  : TextView = itemView.findViewById(R.id.stok_quantity)
        val donate_quantity  : TextView = itemView.findViewById(R.id.donate_quantity)
        val demand_quantity  : TextView = itemView.findViewById(R.id.demand_quantity)

        val stok_bar : ProgressBar = itemView.findViewById(R.id.stok_bar)
        val donation_bar : ProgressBar = itemView.findViewById(R.id.donation_bar)
        val max_donation_bar : ProgressBar = itemView.findViewById(R.id.max_donation_bar)
        val progressBar : ProgressBar = itemView.findViewById(R.id.progressBar)

//        val replenishment_dateTime : TextView = itemView.findViewById(R.id.replenishment_dateTime)

    }
}