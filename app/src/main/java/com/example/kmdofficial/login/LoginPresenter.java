package com.example.kmdofficial.login;

public class LoginPresenter implements LoginContract.Presenter {

    LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void login(String user, String pass) {
        if (user.equals("admin") && pass.equals("1234")) {
            view.loginSuccess();
        } else {
            view.loginFailed();
        }
    }
}
