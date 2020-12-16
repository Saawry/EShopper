package com.example.e_shopper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView newAccTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        newAccTv = findViewById(R.id.new_acc_tv);
        newAccTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAccIntent = new Intent (ProfileActivity.this, CreateAccountActivity.class);
                startActivity(newAccIntent);
            }
        });


    }
}
