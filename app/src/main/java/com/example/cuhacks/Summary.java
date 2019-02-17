package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;


public class Summary extends AppCompatActivity {

    int income_1;
    int income_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
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

    public void calculateNow(View view){

        income_1 = getIntent().getIntExtra("EXTRA_INT1",0);
        income_2 = getIntent().getIntExtra("EXTRA_INT2",0);



    }
}

