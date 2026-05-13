package com.dibdroid.minigrocerydeliveryapp.data.model

data class CartItem(
    val product: Product, // the actual product being thought
    var quantity: Int // How many of this to specific product are in cart
)