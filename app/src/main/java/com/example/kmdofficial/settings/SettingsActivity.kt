package com.example.kmdofficial.settings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.kmdofficial.R
import com.example.kmdofficial.language.LanguageActivity
import com.example.kmdofficial.utils.Prefs

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val prefs = Prefs(this)

        // --- DARK MODE SWITCH ---
        val switchTheme = findViewById<Switch>(R.id.switchTheme)
        switchTheme.isChecked = prefs.isDarkMode()
        switchTheme.setOnCheckedChangeListener { _, isChecked ->
            prefs.setDarkMode(isChecked)
            AppCompatDelegate.setDefaultNightMode(
                if (isChecked) AppCompatDelegate.MODE_NIGHT_YES
                else AppCompatDelegate.MODE_NIGHT_NO
            )
        }

        // --- LANGUAGE BUTTON ---
        val btnChangeLanguage = findViewById<Button>(R.id.btnChangeLanguage)
        btnChangeLanguage.setOnClickListener {
            startActivity(Intent(this, LanguageActivity::class.java))
        }
    }
}
