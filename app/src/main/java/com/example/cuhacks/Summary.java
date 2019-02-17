package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        //Intent intent = getIntent();
        int message = getIntent().getIntExtra("EXTRA_INT1", 0);
        String fmessage = Integer.toString(message);
        TextView textView = findViewById(R.id.textView9);
        textView.setText(fmessage);
        int message1 = getIntent().getIntExtra("EXTRA_INT2", 0);
        String fmessage1 = Integer.toString(message1);
        TextView textView1 = findViewById(R.id.textView10);
        textView1.setText(fmessage1);
        //int message2 = getIntent().getIntExtra("EXTRA_INT3", 0);
        //String fmessage2 = Integer.toString(message2);
        //TextView textView2 = findViewById(R.id.textView11);
        //textView2.setText(fmessage2);
        int message2 = getIntent().getIntExtra("EXTRA_INT3", 8);
        String fmessage2 = Integer.toString(message2);
        TextView textView2 = findViewById(R.id.textView11);
        textView2.setText(fmessage2);
        int message3 = getIntent().getIntExtra("EXTRA_INT4", 8);
        String fmessage3 = Integer.toString(message3);
        TextView textView3 = findViewById(R.id.textView12);
        textView3.setText(fmessage3);
    }

    public void editIncome(View view) {
        Intent intent = new Intent(this, secondPage.class);
        startActivity(intent);
    }

    public void editCustody(View view) {
        Intent intent = new Intent(this, thirdPage.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, thirdPage.class);
        startActivity(intent);
    }

    public void calculate(View view) {
        Intent intent = new Intent(this, totalpage.class);
        startActivity(intent);
    }

}

