package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        TextView textView = findViewById(R.id.city_name_textview);
        Button backButton = findViewById(R.id.back_button);

        String cityName = getIntent().getStringExtra("CITY_NAME");
        textView.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}
