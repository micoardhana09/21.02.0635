package com.example.a21020635;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());

        TextView txtFirst = findViewById(R.id.textFirstActivity);

        //Intent intent = getIntent();
        //String nama = intent.getStringExtra("nama");


        txtFirst.setText(preferenceHelper.getNama());
    }
}