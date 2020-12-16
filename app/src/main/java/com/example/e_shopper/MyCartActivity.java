package com.example.e_shopper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MyCartActivity extends AppCompatActivity {

    private RecyclerView cartRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        cartRecycler = findViewById(R.id.cart_recycler);
    }
}
