package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public static final String msg = "order";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View v)
    {
        Intent intent = new Intent(this, OrderActivity.class);

        EditText item1 = findViewById(R.id.item1);
        EditText item2 = findViewById(R.id.item2);
        EditText item3 = findViewById(R.id.item3);

        String message = item1.getText().toString() + ","
                + item2.getText().toString() + "&"
                + item3.getText().toString();

        intent.putExtra(msg, message);

        startActivity(intent);


    }
}