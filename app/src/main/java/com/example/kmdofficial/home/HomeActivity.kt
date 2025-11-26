package com.example.kmdofficial.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kmdofficial.R
import com.example.kmdofficial.settings.SettingsActivity
import com.example.kmdofficial.utils.LocaleHelper
import com.example.kmdofficial.utils.Prefs

class HomeActivity : AppCompatActivity() {

    private val categories = listOf(
        "contact_messages",
        "email_subscribers",
        "products",
        "product_sales",
        "slideshow",
        "suppliers"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        // Apply saved language before super.onCreate
        Prefs(this).getLanguage()?.let { LocaleHelper.setLocale(this, it) }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // RecyclerView for categories
        val recycler = findViewById<RecyclerView>(R.id.recyclerHome)
        recycler.layoutManager = LinearLayoutManager(this)
        val adapter = HomeAdapter(categories, this)
        recycler.adapter = adapter

        // Fade-in animation for RecyclerView
        recycler.alpha = 0f
        recycler.animate().alpha(1f).setDuration(600).setStartDelay(200).start()

        // Settings button
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}
