package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //private static final int EXTRA_INT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, secondPage.class);
        startActivity(intent);
    }
    public void gothirdPage(View view) {
        Intent intent = new Intent(this, thirdPage.class);
        //EditText editText = (EditText) findViewById(R.id.editText3);
        //String message = editText.getText().toString();
        //int finalMessage = Integer.parseInt(message);
        //intent.putExtra("EXTRA_INT", finalMessage);
        startActivity(intent);
    }
}
