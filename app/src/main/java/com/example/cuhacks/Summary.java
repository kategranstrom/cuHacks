package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Summary extends AppCompatActivity {

    int parent_income_1;
    int parent_income_2;
    int parent_kids_1;
    int parent_kids_2;
    double parent_support_1;
    double parent_support_2;
    double diff;
    String whichParent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        //Intent intent = getIntent();
        parent_kids_1 = getIntent().getIntExtra("EXTRA_INT1", 0);
        String fmessage = Integer.toString(parent_kids_1);
        TextView textView = findViewById(R.id.textView9);
        textView.setText(fmessage);
        parent_kids_2 = getIntent().getIntExtra("EXTRA_INT2", 0);
        String fmessage1 = Integer.toString(parent_kids_2);
        TextView textView1 = findViewById(R.id.textView10);
        textView1.setText(fmessage1);
        //int message2 = getIntent().getIntExtra("EXTRA_INT3", 0);
        //String fmessage2 = Integer.toString(message2);
        //TextView textView2 = findViewById(R.id.textView11);
        //textView2.setText(fmessage2);
        //Bundle extras = new Bundle();
        //String stringVariableName = extras.getString
        parent_income_1 = getIntent().getIntExtra("EXTRA_INT3", 0);
        String fmessage2 = Integer.toString(parent_income_1);
        TextView textView2 = findViewById(R.id.textView11);
        textView2.setText(fmessage2);
        parent_income_2 = getIntent().getIntExtra("EXTRA_INT4", 0);
        String fmessage3 = Integer.toString(parent_income_2);
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

        if(parent_income_1<= 50000 )
        {
            if (parent_kids_2 == 0) {
                parent_support_1 = 0.0;
            }
            if(parent_kids_2 == 1 )
            {
                parent_support_1 = parent_income_1 * 0.00629;
            }
            else if (parent_kids_2 == 2 )
            {
                parent_support_1 = parent_income_1 * 0.01095;
            }
            else if (parent_kids_2 == 3)
            {
                parent_support_1 = parent_income_1 * 0.014747;
            }
            else
            {
                parent_support_1 = parent_income_1 * 0.01621;
            }

        }
        else if (parent_income_1 > 50000 && parent_income_1 <= 100000)
        {
            if (parent_kids_2 == 0) {
                parent_support_1 = 0.0;
            }

            if(parent_kids_2 == 1)
            {
                parent_support_1 = parent_income_1 * 0.008641;
            }
            else if (parent_kids_2 == 2)
            {
                parent_support_1 = parent_income_1 * 0.01424;
            }
            else if (parent_kids_2 == 3)
            {
                parent_support_1 = parent_income_1 * 0.01833;
            }
            else
            {
                parent_support_1 = parent_income_1 * 0.02238;
            }
        }
        else if (parent_income_1 > 100000 && parent_income_1 <= 150000)
        {
            if (parent_kids_2 == 0) {
                parent_support_1 = 0.0;
            }

            if(parent_kids_2 == 1)
            {
                parent_support_1 = parent_income_1 * 0.008869;
            }
            else if (parent_kids_2 == 2)
            {
                parent_support_1 = parent_income_1 * 0.01438;
            }
            else if (parent_kids_2 == 3)
            {
                parent_support_1 = parent_income_1 * 0.01855;
            }
            else //4th Child and above
            {
                parent_support_1 = parent_income_1 * 0.022083;
            }
        }
        else {
            if (parent_kids_2 == 0) {
                parent_support_1 = 0.0;
            }
            if (parent_kids_2 == 1) {
                parent_support_1 = (parent_income_1 * 0.72) + 1299;
            }
            else if (parent_kids_2 == 2) {
                parent_support_1 = (parent_income_1 * 1.20) + 2077;
            }
            else if (parent_kids_2 == 3) {
                parent_support_1 = (parent_income_1 * 1.46) + 2698;
            }
            else //Forth Child and above
            {
                parent_support_1 = (parent_income_1 * 1.76) + 3207;
            }
        }


            if(parent_income_2<= 50000 )
            {
                if(parent_kids_1 == 0) {
                    parent_support_2 = 0.0;
                }
                if(parent_kids_1 == 1 )
                {
                    parent_support_2 = parent_income_2 * 0.00629;
                }
                else if (parent_kids_1 == 2 )
                {
                    parent_support_2 = parent_income_2 * 0.01095;
                }
                else if (parent_kids_1 == 3)
                {
                    parent_support_2 = parent_income_2 * 0.014747;
                }
                else
                {
                    parent_support_2 = parent_income_2 * 0.01621;
                }

            }
            else if (parent_income_2 > 50000 && parent_income_2 <= 100000)
            {
                if (parent_kids_1 == 0) {
                    parent_support_2 = 0.0;
                }
                if(parent_kids_1 == 1)
                {
                    parent_support_2 = parent_income_2 * 0.008641;
                }
                else if (parent_kids_1 == 2)
                {
                    parent_support_2 = parent_income_2 * 0.01424;
                }
                else if (parent_kids_1 == 3)
                {
                    parent_support_2 = parent_income_2 * 0.01833;
                }
                else
                {
                    parent_support_2 = parent_income_2 * 0.02238;
                }
            }
            else if (parent_income_2 > 100000 && parent_income_2 <= 150000)
            {
                if(parent_kids_1 == 0) {
                    parent_support_2 = 0.0;
                }
                if(parent_kids_1 == 1)
                {
                    parent_support_2 = parent_income_2 * 0.008869;
                }
                else if (parent_kids_1 == 2)
                {
                    parent_support_2 = parent_income_2 * 0.01438;
                }
                else if (parent_kids_1 == 3)
                {
                    parent_support_2 = parent_income_2 * 0.01855;
                }
                else
                {
                    parent_support_2 = parent_income_2 * 0.022083;
                }
            }
            else {
                if(parent_kids_1 == 0) {
                    parent_support_2 = 0.0;
                }
                if (parent_kids_1 == 1) {
                    parent_support_2 = (parent_income_2 * 0.72) + 1299;
                }
                else if (parent_kids_1 == 2) {
                    parent_support_2 = (parent_income_2 * 1.20) + 2077;
                }
                else if (parent_kids_1 == 3) {
                    parent_support_2 = (parent_income_2 * 1.46) + 2698;
                }
                else {
                    parent_support_2 = (parent_income_2 * 1.76) + 3207;
                }
            }





                diff = (parent_support_1 - parent_support_2); //Need Absolute Value

                Intent intent2 = new Intent(this, totalpage.class);


                if (parent_support_1 > parent_support_2)
                {
                    whichParent = "Parent 1";
                    intent2.putExtra("name",whichParent);
                    intent2.putExtra("amount",diff);
                }
                else if (parent_support_2 > parent_support_1)
                {
                    whichParent = "Parent 2";
                    intent2.putExtra("name",whichParent);
                    intent2.putExtra("amount",diff);

                }
                else
                {
                    whichParent = "Both Parents";
                    intent2.putExtra("name",whichParent);
                    intent2.putExtra("amount",diff);
                }



        }
    }


