package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class PracticeMainScreen extends AppCompatActivity implements View.OnClickListener {

    public int randomgenerator(int min, int max)
    {
        int index = (int)(Math.random()*(max-min+1)+min);
        return index;
    }

   // int index = (int)(Math.random()*(max-min+1)+min);
//   int min = 1;
//    int max= 12;
    int index= randomgenerator(1, 12);
    String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White" };


    Button opt1button, opt2button, opt3button, opt4button;

   // int index = 0;

   //  int index = 5;
   // String colorsarray[];


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_main_screen);


        opt1button = findViewById(R.id.opt1button);
        opt2button = findViewById(R.id.opt2button);
        opt3button = findViewById(R.id.opt3button);
        opt4button = findViewById(R.id.opt4button);

        opt1button.setOnClickListener(this);
        opt2button.setOnClickListener(this);
        opt3button.setOnClickListener(this);
        opt4button.setOnClickListener(this);

        


        TextView questionheadingview = findViewById(R.id.questionheading);
        questionheadingview.setText("Select button in "+ colorsarray[index] + " color:");



    }



   // String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White" };



    String hell = "bye";


    @Override
    public void onClick(View view) {

    }
}