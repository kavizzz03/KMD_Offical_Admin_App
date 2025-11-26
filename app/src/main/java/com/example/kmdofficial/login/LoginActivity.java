package com.example.kmdofficial.login;

import android.content.Intent;
import android.os.Bundle;
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

        etUser = findViewById(R.id.username);
        etPass = findViewById(R.id.password);

        presenter = new LoginPresenter(this);

        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            String user = etUser.getText().toString().trim();
            String pass = etPass.getText().toString().trim();
            presenter.login(user, pass);
        });
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
