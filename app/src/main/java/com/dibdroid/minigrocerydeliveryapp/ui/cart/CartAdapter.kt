package com.dibdroid.minigrocerydeliveryapp.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dibdroid.minigrocerydeliveryapp.data.model.CartItem
import com.dibdroid.minigrocerydeliveryapp.databinding.ItemCartBinding

class CartAdapter(private val cartItems : List<CartItem>):
RecyclerView.Adapter<CartAdapter.CartViewHolder>(){

    class CartViewHolder(val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItems[position]
        val product = item.product

        // Set the data from the Product
        holder.binding.tvProductName.text = product.name
        holder.binding.tvProductPrice.text = "${product.price.toInt()}"
        holder.binding.tvProductUnit.text = product.unit
        holder.binding.ivProduct.setImageResource(product.imageRes)

        //set the current quantity
        holder.binding.tvQuantity.text = item.quantity.toString()

        // --- QUANTITY LOGIC ---

        // Plus Button: Increase quantity and refresh
        holder.binding.btnPlus.setOnClickListener {
            item.quantity++
            notifyItemChanged(position)
        }

        // Minus Button : Decrease quantity (but dont go below 1)
        holder.binding.btnMinus.setOnClickListener {
            if (item.quantity > 1){
                item.quantity--
                notifyItemChanged(position)
            }
        }
    }

    override fun getItemCount(): Int = cartItems.size



}