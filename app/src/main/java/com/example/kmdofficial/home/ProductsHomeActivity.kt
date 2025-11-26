package com.example.kmdofficial.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kmdofficial.R

class ProductsHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_home)

        val btnAdd = findViewById<Button>(R.id.btnAddProduct)
        val btnView = findViewById<Button>(R.id.btnViewProducts)
        val btnDelete = findViewById<Button>(R.id.btnDeleteProduct)

        /*btnAdd.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        btnView.setOnClickListener {
            startActivity(Intent(this, ViewProductsActivity::class.java))
        }

        btnDelete.setOnClickListener {
            startActivity(Intent(this, DeleteProductsActivity::class.java))
        }*/
    }
}
