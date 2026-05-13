package com.dibdroid.minigrocerydeliveryapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dibdroid.minigrocerydeliveryapp.data.model.Product
import com.dibdroid.minigrocerydeliveryapp.data.repository.CartRepository
import com.dibdroid.minigrocerydeliveryapp.databinding.ItemProductBinding

class ProductAdapter(private var productList: List<Product>) :
        RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

            private val orginalList = productList.toList()

    class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        holder.binding.tvProductName.text = product.name
        holder.binding.tvProductPrice.text = "${product.price.toInt()}"
        holder.binding.tvProductUnit.text = product.unit
        holder.binding.ivProduct.setImageResource(product.imageRes)

        holder.binding.btnAdd.setOnClickListener {
            CartRepository.addItem(product)
            android.widget.Toast.makeText(holder.itemView.context, "${product.name} added!",
                android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = productList.size

    fun filterList(query : String) {
        productList = if ((query.isEmpty())){
            orginalList
        }else {
            orginalList.filter { it.name.contains(query, ignoreCase = true) }
        }
        notifyDataSetChanged()
    }


}