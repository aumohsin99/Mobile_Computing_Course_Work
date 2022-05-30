package com.example.list_view_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Bhindi");
        grocery.add("Pen");
        grocery.add("Bag");


     //   ArrayAdapter<String> myAdapter = new ArrayAdapter<String>( context:this, android.R.layout.simple_list_item_1, grocery);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter(myAdapter);
        






    }
}