package com.example.kmdofficial.utils

import android.content.Context

class Prefs(context: Context) {
    private val pref = context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    // Language
    fun saveLanguage(lang: String) = pref.edit().putString("lang", lang).apply()
    fun getLanguage(): String? = pref.getString("lang", null)

    // Dark mode
    fun setDarkMode(enabled: Boolean) = pref.edit().putBoolean("dark", enabled).apply()
    fun isDarkMode() = pref.getBoolean("dark", false)

    // First launch
    fun setFirstLaunch(isFirst: Boolean) = pref.edit().putBoolean("first_launch", isFirst).apply()
    fun isFirstLaunch() = pref.getBoolean("first_launch", true)
}
