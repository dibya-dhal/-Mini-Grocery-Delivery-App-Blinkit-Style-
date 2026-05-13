package com.dibdroid.minigrocerydeliveryapp.ui.cart

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dibdroid.minigrocerydeliveryapp.data.repository.CartRepository
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivityCartBinding
import com.dibdroid.minigrocerydeliveryapp.ui.checkout.CheckoutActivity

class CartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnClearCart.setOnClickListener {
            CartRepository.clearCart()

            binding.rvCartItems.adapter = CartAdapter(emptyList())
            binding.tvItemTotal.text = "0"
            binding.tvToPay.text = "20"
        }


        // 1. Setup the List
        val cartItems = CartRepository.getCartItems()
        val adapter = CartAdapter(cartItems)

        binding.rvCartItems.layoutManager = LinearLayoutManager(this)
        binding.rvCartItems.adapter = adapter

        val itemTotal = CartRepository.getCartTotal()
        val deliveryFee = 20.0
        val toPay = itemTotal + deliveryFee

        binding.tvItemTotal.text =  "${itemTotal.toInt()}"
        binding.tvDeliveryFee.text = "${deliveryFee.toInt()}"
        binding.tvToPay.text = "${toPay.toInt()}"

        // 3. setup button
        binding.btnProceed.setOnClickListener {
            // to navigate to the checkout activity

            if (CartRepository.getCartItems().isNotEmpty()){
                // here for move to next checkout screen
                val intent = Intent(this, CheckoutActivity::class.java)
                startActivity(intent)


            }else {
                android.widget.Toast.makeText(this, "Add items to cart first!",
                    android.widget.Toast.LENGTH_SHORT).show()
            }
        }



    }
}