package com.dibdroid.minigrocerydeliveryapp.ui.ordersuccess

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dibdroid.minigrocerydeliveryapp.data.repository.CartRepository
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivityOrdersucessBinding
import com.dibdroid.minigrocerydeliveryapp.ui.home.HomeActivity

class OrderSuccessActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityOrdersucessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOrdersucessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CartRepository.clearCart()

        val randomNum = (100000..999999).random()
        binding.tvOrderId.text = "#ORD$randomNum"


        binding.btnContinue.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }


    }
}