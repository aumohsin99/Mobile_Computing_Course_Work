package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class YellowPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_page);


        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        TextView head = findViewById(R.id.yellowheading);
        head.setText(message);
    }
}