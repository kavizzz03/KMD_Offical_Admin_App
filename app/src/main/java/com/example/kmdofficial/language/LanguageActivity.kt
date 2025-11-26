package com.example.kmdofficial.language

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kmdofficial.R
import com.example.kmdofficial.home.HomeActivity
import com.example.kmdofficial.utils.LocaleHelper
import com.example.kmdofficial.utils.Prefs

class LanguageActivity : AppCompatActivity(), LanguageContract.View {

    private lateinit var presenter: LanguagePresenter
    private lateinit var prefs: Prefs

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = Prefs(this)
        // Apply saved language if exists
        prefs.getLanguage()?.let { LocaleHelper.setLocale(this, it) }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        presenter = LanguagePresenter(this)

        val btnEnglish = findViewById<Button>(R.id.btnEnglish)
        val btnSinhala = findViewById<Button>(R.id.btnSinhala)

        btnEnglish.setOnClickListener { presenter.setLanguage(this, "en") }
        btnSinhala.setOnClickListener { presenter.setLanguage(this, "si") }
    }

    override fun navigateToHome() {
        // Restart HomeActivity to reflect language immediately
        val intent = Intent(this, HomeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
}
