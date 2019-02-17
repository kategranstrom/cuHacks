package com.example.cuhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class thirdPage extends AppCompatActivity {

    //private static final int EXTRA_INT1 = 0;
    //private static final int EXTRA_INT2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }
    public void Summary(View view) {
        Intent intent = new Intent(this, Summary.class);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message2 = editText2.getText().toString();
        int finalMessage2 = Integer.parseInt(message2);
        intent.putExtra("EXTRA_INT1", finalMessage2);
        EditText editText3 = (EditText) findViewById(R.id.editText4);
        String message3 = editText3.getText().toString();
        int finalMessage3 = Integer.parseInt(message3);
        intent.putExtra("EXTRA_INT2", finalMessage3);
        startActivity(intent);
        int i1 = getIntent().getIntExtra("EXTRA_INT1", -1);
        int i2 = getIntent().getIntExtra("EXTRA_INT2", -1);
        intent.putExtra("EXTRA_INT3", i1);
        intent.putExtra("EXTRA_INT4", i2);
    }
}
