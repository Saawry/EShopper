package com.example.e_shopper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifyCodeActivity extends AppCompatActivity {

    private Button btnReg;
    private Button btnGetCode;
    private Button btnLogin;
    private Button btnVerify;
    private EditText codeET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        btnGetCode = findViewById(R.id.send_verification_code_button);
        btnReg = findViewById(R.id.phn_register_button);
        btnLogin = findViewById(R.id.phn_login_button);
        btnVerify = findViewById(R.id.verify_button);
        codeET = findViewById(R.id.verification_code_input);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(VerifyCodeActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(VerifyCodeActivity.this, CreateAccountActivity.class);
                startActivity(regIntent);
            }
        });
        btnGetCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVerify.setVisibility(View.VISIBLE);
                codeET.setVisibility(View.VISIBLE);
                btnGetCode.setVisibility(View.INVISIBLE);
            }
        });
    }
}
