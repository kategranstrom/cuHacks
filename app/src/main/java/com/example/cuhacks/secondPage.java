package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }
    public void gothirdPage(View view) {
        Intent intent = new Intent(this, thirdPage.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString();
        int finalMessage = Integer.parseInt(message);

        if (finalMessage < 0){
            finalMessage = 0;
        }

        intent.putExtra("EXTRA_INT1", finalMessage);


        EditText editText2 = (EditText) findViewById(R.id.editText4);
        String message2 = editText2.getText().toString();
        int finalMessage2 = Integer.parseInt(message2);

        if (finalMessage2 <0){
            finalMessage2 = 0;
        }
        intent.putExtra("EXTRA_INT2", finalMessage2);


        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


