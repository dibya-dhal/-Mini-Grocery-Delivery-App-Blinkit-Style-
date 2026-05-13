package com.dibdroid.minigrocerydeliveryapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivtyLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivtyLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivtyLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendOtp.setOnClickListener {
            var phone = binding.etPhoneNumber.text.toString()
            if (phone.length == 10){
                // Move from Login screen to OTP screen
                val intent = Intent(this, OtpActivity::class.java)
                intent.putExtra("phone",phone) // pass data to next screen
                startActivity(intent)
            }else {
                Toast.makeText(this, "Enter a valid 10-digit number", Toast.LENGTH_SHORT).show()
            }
        }


    }
}