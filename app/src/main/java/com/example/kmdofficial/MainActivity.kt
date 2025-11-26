package com.example.kmdofficial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kmdofficial.login.LoginActivity
import com.example.kmdofficial.language.LanguageActivity
import com.example.kmdofficial.utils.LocaleHelper
import com.example.kmdofficial.utils.Prefs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val prefs = Prefs(this)

        // Apply saved language if exists
        prefs.getLanguage()?.let { LocaleHelper.setLocale(this, it) }

        super.onCreate(savedInstanceState)

        if (prefs.isFirstLaunch()) {
            // First launch → show language selection
            startActivity(Intent(this, LanguageActivity::class.java))
        } else {
            // Already selected → go to Login first
            startActivity(Intent(this, LoginActivity::class.java))
        }

        finish()
    }
}
