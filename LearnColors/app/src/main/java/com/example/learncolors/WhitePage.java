package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WhitePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_page);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        TextView head = findViewById(R.id.whiteheading);
        head.setText(message);
    }
}