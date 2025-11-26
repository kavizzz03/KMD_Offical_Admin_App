package com.example.kmdofficial.language


interface LanguageContract {
    interface View {
        fun navigateToHome()
    }

    interface Presenter {
        fun setLanguage(context: LanguageActivity, lang: String)
    }
}
