package com.example.kmdofficial.login;

public interface LoginContract {
    interface View {
        void loginSuccess();
        void loginFailed();
    }

    interface Presenter {
        void login(String user, String pass);
    }
}
