package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class totalpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totalpage);

        Intent intent = getIntent();
        int message = intent.getIntExtra("EXTRA_INT", -1);

        TextView textView = findViewById(R.id.textView6);
        textView.setText(message);
    }
}
