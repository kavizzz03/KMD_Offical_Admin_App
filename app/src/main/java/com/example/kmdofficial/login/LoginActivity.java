package com.example.kmdofficial.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kmdofficial.R;
import com.example.kmdofficial.home.HomeActivity;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private EditText etUser, etPass;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        etUser = findViewById(R.id.username);
        etPass = findViewById(R.id.password);

        presenter = new LoginPresenter(this);

        // Login button click
        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            String user = etUser.getText().toString().trim();
            String pass = etPass.getText().toString().trim();
            presenter.login(user, pass);
        });

        // Fade-in animations
        View logo = findViewById(R.id.logo);
        View title = findViewById(R.id.title);
        View username = findViewById(R.id.usernameLayout);
        View password = findViewById(R.id.passwordLayout);
        View btnLogin = findViewById(R.id.btnLogin);

        logo.animate().alpha(1f).translationY(0).setDuration(800).setStartDelay(100).start();
        title.animate().alpha(1f).translationY(0).setDuration(800).setStartDelay(300).start();
        username.animate().alpha(1f).translationY(0).setDuration(800).setStartDelay(500).start();
        password.animate().alpha(1f).translationY(0).setDuration(800).setStartDelay(700).start();
        btnLogin.animate().alpha(1f).translationY(0).setDuration(800).setStartDelay(900).start();
    }

    @Override
    public void loginSuccess() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
    }
}
