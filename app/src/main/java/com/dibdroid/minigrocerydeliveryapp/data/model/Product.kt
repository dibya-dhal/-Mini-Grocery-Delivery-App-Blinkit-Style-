package com.dibdroid.minigrocerydeliveryapp.data.model

data class Product (

    val id: Int,   // unique id to identify the product
    val name : String,  // Product name
    val price : Double,  // the price of the product
    val unit : String,   // The measurement
    val imageRes : Int, // An Integer because well use local images
    val category : String, // To group products
    var quantity : Int  // How many items the user has selected


)