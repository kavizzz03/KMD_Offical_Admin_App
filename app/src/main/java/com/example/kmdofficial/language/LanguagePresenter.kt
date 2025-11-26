package com.example.kmdofficial.language

import android.content.Context
import android.content.Intent
import com.example.kmdofficial.home.HomeActivity
import com.example.kmdofficial.utils.Prefs
import com.example.kmdofficial.utils.LocaleHelper

class LanguagePresenter(private val view: LanguageContract.View) :
    LanguageContract.Presenter {

    override fun setLanguage(context: LanguageActivity, lang: String) {
        // Save language
        Prefs(context).saveLanguage(lang)
        Prefs(context).setFirstLaunch(false)

        // Apply locale before navigating
        LocaleHelper.setLocale(context, lang)

        // Tell view to navigate
        view.navigateToHome()
    }
}
