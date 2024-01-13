package com.jake.mysecondapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.jake.mysecondapp.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.secondTextView);
            String text = getIntent().getExtras().getString("com.jake.mysecondapp.SOMETHING");
            tv.setText(text);
        }

    }
}