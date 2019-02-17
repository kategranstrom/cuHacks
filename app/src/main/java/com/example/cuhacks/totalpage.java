package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class totalpage extends AppCompatActivity {

    String parent;
    double amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totalpage);
    }

    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        parent = getIntent().getStringExtra("name");
        amount = getIntent().getIntExtra("amount",0);


        TextView textView = findViewById(R.id.textView16);
        textView.setText(parent);

        TextView textView1 = findViewById(R.id.textView17);
        textView1.setText(String.format("%0.2f",amount));

        startActivity(intent);
    }









}
