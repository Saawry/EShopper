package com.example.e_shopper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccountActivity extends AppCompatActivity {

    private Button loginBtn;
    private Button newAccBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        loginBtn= findViewById(R.id.login_button);
        newAccBtn= findViewById(R.id.create_acc_button);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIntent = new Intent(CreateAccountActivity.this, LoginActivity.class);
                startActivity(logIntent);
            }
        });
        newAccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verifyIntent = new Intent(CreateAccountActivity.this, VerifyCodeActivity.class);
                startActivity(verifyIntent);
            }
        });
    }
}
