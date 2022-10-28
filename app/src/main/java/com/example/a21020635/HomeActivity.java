package com.example.a21020635;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    PreferenceHelper preferenceHelper;
    private Button btnActivity, btnFragment;
    public EditText etNama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());

        btnActivity = findViewById(R.id.btnActivity);
        btnFragment = findViewById(R.id.btnFragment);
        etNama = findViewById(R.id.etNama);


        btnActivity.setOnClickListener(v -> {
            preferenceHelper.setLogin(true);
            preferenceHelper.setNama(etNama.getText().toString());
            Intent homeIntent = new Intent(HomeActivity.this, FirstActivity.class);
            //homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //homeIntent.putExtra("nama", etNama.getText().toString());
            startActivity(homeIntent);
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(HomeActivity.this, SecondActivity.class);
                startActivity(secondIntent);
            }
        });

    }
}