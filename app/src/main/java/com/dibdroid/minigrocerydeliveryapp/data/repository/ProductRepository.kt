package com.dibdroid.minigrocerydeliveryapp.data.repository

import com.dibdroid.minigrocerydeliveryapp.R
import com.dibdroid.minigrocerydeliveryapp.data.model.Product

class ProductRepository {
    fun getAllProducts(): List<Product> {

        return listOf(
            // id, name, price, unit, imageRes, category, quantity
            Product(1, "Apple", 120.0, "1 kg", R.drawable.apple, "Fruits", 0),
            Product(2, "Banana", 40.0, "1 kg", R.drawable.banana, "Fruits", 0),
            Product(3, "Mango", 150.0, "1 kg", R.drawable.mango, "Fruits", 0),
            Product(4, "Orange", 80.0, "1 kg", R.drawable.orange, "Fruits", 0),
            Product(5, "Milk", 56.0, "1 L", R.drawable.milk, "Dairy", 0)
        )


    }
}