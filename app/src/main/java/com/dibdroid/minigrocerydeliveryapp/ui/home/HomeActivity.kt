package com.dibdroid.minigrocerydeliveryapp.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dibdroid.minigrocerydeliveryapp.data.repository.ProductRepository
import com.dibdroid.minigrocerydeliveryapp.databinding.ActivityHomeBinding
import com.dibdroid.minigrocerydeliveryapp.ui.cart.CartActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.clBanner.setOnClickListener {
            val intent = android.content.Intent(this, CartActivity::class.java)
            startActivity(intent)
        }


        // 1. Get the list of products from our Repository

        val productList = ProductRepository().getAllProducts()
        //2. Create the adapter and give it the list
        productAdapter = ProductAdapter(productList)


        binding.rvProducts.layoutManager = LinearLayoutManager(this)
        binding.rvProducts.adapter = productAdapter

        binding.etSearch.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Call the filter function we added in ProductAdapter
                productAdapter.filterList(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}



        })

    }
}