package com.example.kmdofficial.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kmdofficial.R
import com.example.kmdofficial.home.ProductsHomeActivity

class HomeAdapter(private val items: List<String>, private val context: Context) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.txtTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_home_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.replace("_", " ")
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        // Handle click
        holder.itemView.setOnClickListener {
            if (item == "products") {
                val intent = Intent(context, ProductsHomeActivity::class.java)
                context.startActivity(intent)
            }
            // Add other category clicks here if needed
        }
    }

    override fun getItemCount() = items.size
}
