package com.dibdroid.minigrocerydeliveryapp.data.repository

import com.dibdroid.minigrocerydeliveryapp.data.model.CartItem
import com.dibdroid.minigrocerydeliveryapp.data.model.Product

object CartRepository {
    private val cartList = mutableListOf<CartItem>()

    fun addItem(product: Product) {
        val existingItem = cartList.find { it.product.id == product.id }
        if (existingItem != null) {
            existingItem.quantity++
        }else {
            cartList.add(CartItem(product, 1))
        }
    }
    fun getCartItems() : List<CartItem> = cartList

    fun getCartTotal() : Double {
        return cartList.sumOf { it.product.price * it.quantity }
    }

    fun clearCart() {
        cartList.clear()
    }
}