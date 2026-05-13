package com.dibdroid.minigrocerydeliveryapp.ui.checkout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivityCheckoutBinding
import com.dibdroid.minigrocerydeliveryapp.ui.ordersuccess.OrderSuccessActivity

class CheckoutActivity: AppCompatActivity() {
    private lateinit var binding: ActivityCheckoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnPlaceOrder.setOnClickListener {
            startActivity(Intent(this, OrderSuccessActivity::class.java))
            finish()
        }
    }
}