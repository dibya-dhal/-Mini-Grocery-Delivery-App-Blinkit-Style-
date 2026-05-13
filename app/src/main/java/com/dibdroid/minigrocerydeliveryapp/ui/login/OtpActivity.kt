package com.dibdroid.minigrocerydeliveryapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.dibdroid.minigrocerydeliveryapp.MainActivity
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivityOtpBinding
import com.dibdroid.minigrocerydeliveryapp.ui.home.HomeActivity

class OtpActivity : AppCompatActivity(){
    private lateinit var binding : ActivityOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // show the number passed from LoginActivity
        val phoneNumber = intent.getStringExtra("phone")
        binding.tvVerifySub.text = "Enter the 4-digit OTP sent to \n+91 $phoneNumber"
       binding.btnBlack.setOnClickListener { finish() } // Go back to login

       binding.btnVerify.setOnClickListener {
           //Check if OTP is 1234
           val otp = binding.etOtp1.text.toString()

           //for now lets just check if they clicked verify
           // Later we'll make a better 4-box check
           startActivity(Intent(this, HomeActivity::class.java))
           finish()
       }

    }
}