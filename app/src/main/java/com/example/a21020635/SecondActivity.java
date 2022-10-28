package com.example.a21020635;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    PreferenceHelper preferencesHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtFirst = findViewById(R.id.textFirstActivity);

        //Intent intent = getIntent();
        //String nama = intent.getStringExtra("nama");


        txtFirst.setText(preferencesHelper.getNama());

    }
}