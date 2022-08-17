package com.example.learncolors;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;
import java.util.Map;

public class PracticeMainScreen extends AppCompatActivity implements View.OnClickListener
{
    // int index = (int)(Math.random()*(max-min+1)+min);
    //   int min = 1;
    //    int max= 12;
    int index = randomgenerator(1, 12);

    String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White"};
    String[] optionsarray = {};

    public int randomgenerator(int min, int max)
    {
        int index = (int) (Math.random() * (max - min + 1) + min);
        return index;
    }

    public int four_randomgenerator(int min, int max)
    {
        int i = 0;
        int j = (int) (Math.random() * (max - min + 1) + min);
        while (i < 5) {s
            i++;
        }
        return 0;
    }




}





    //Map<String, String> dictionaryone = new Map<String, String>() ;


    Button opt1button, opt2button, opt3button, opt4button;

    // int index = 0;

    //  int index = 5;
    // String colorsarray[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        questionheadingview.setText("Select button in " + colorsarray[index] + " color:");


    }


    // String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White" };

   // opt1button =
//    opt1button.setBackgroundColor(Android.Graphics.Color.parseColor("#738b28"));
//
//    opt1button.set
//  opt1button.setBakc(Color.parseColor("#97a0ad"));
//
//
//            if opt1button.
//    String hell = "bye";


    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(PracticeMainScreen.this, PracticeMainScreen.class);
        switch (view.getId())
        {
            case R.id.opt1button:
                intent.putExtra("text", "A");
                // intent.putExtra("picture", R.drawable.a);
                startActivity(intent);
                break;

            case R.id.opt2button:
                intent.putExtra("text", "B");
                // intent.putExtra("picture", R.drawable.b);
                startActivity(intent);
                break;

            case R.id.opt3button:
                intent.putExtra("text", "C");
                // intent.putExtra("picture", R.drawable.c);
                startActivity(intent);

                break;

            case R.id.opt4button:
                intent.putExtra("text", "D");
                //intent.putExtra("picture", R.drawable.d);
                startActivity(intent);
                break;
        }
    }

   // public void quiztry1(String[] colorsarray[index], )
    {

    }

}