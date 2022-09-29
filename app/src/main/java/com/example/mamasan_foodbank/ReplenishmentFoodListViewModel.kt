package com.example.mamasan_foodbank

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReplenishmentFoodListViewModel : ViewModel() {
    val liveData = MutableLiveData<ArrayList<FoodData>>()
    private var FoodList = ArrayList<FoodData>()
//    fun updatFoodList(foodData: FoodData){
//        liveData.add(foodData)
//    }
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
    liveData.value = FoodList
}
}