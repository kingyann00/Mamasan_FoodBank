package com.example.mamasan_foodbank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReplenishmentAdapter (val campaignList: ArrayList<Replenishment>,private  val onReplenishmentClickListener:OnReplenishmentClickListener): RecyclerView.Adapter<ReplenishmentAdapter.ViewHolder>() {

    override fun getItemCount()= campaignList.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.replenishmentImg.setBackgroundResource(campaignList[position].replenishmentImg)
        holder.replenishmentTitle.text = campaignList[position].replenishmentTitle
        holder.location.text = campaignList[position].location
//        holder.replenishment_dateTime.text = campaignList[position].replenishment_dateTime
holder.itemView.setOnClickListener{
    onReplenishmentClickListener.onRelenishmentClicked(position)
}


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReplenishmentAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.items_replenishment,parent, false)
        return  ViewHolder(view)
    }
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val replenishmentImg  : ImageView = itemView.findViewById(R.id.replenishmentImg)
        val replenishmentTitle  : TextView = itemView.findViewById(R.id.replenishmentTitle)
        val location : TextView = itemView.findViewById(R.id.location)
        val replenishmentDescription : TextView = itemView.findViewById(R.id.replenishmentDescription)
//        val replenishment_dateTime : TextView = itemView.findViewById(R.id.replenishment_dateTime)

    }
}