package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnMainScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_main_screen);

        Button redbutton = (Button) findViewById(R.id.redbutton);
        Button bluebutton = (Button) findViewById(R.id.bluebutton);
        Button orangebutton = (Button) findViewById(R.id.orangebutton);
        Button blackbutton = (Button) findViewById(R.id.blackbutton);
        Button brownbutton = (Button) findViewById(R.id.brownbutton);
        Button graybutton = (Button) findViewById(R.id.graybutton);
        Button greenbutton = (Button) findViewById(R.id.greenbutton);
        Button purplebutton = (Button) findViewById(R.id.purplebutton);
        Button pinkbutton = (Button) findViewById(R.id.pinkbutton);
        Button whitebutton = (Button) findViewById(R.id.whitebutton);
        Button yellowbutton = (Button) findViewById(R.id.yellowbutton);

        Button summarybutton = (Button) findViewById(R.id.summarybutton);

        redbutton.setOnClickListener(this);
        bluebutton.setOnClickListener(this);
        orangebutton.setOnClickListener(this);
        blackbutton.setOnClickListener(this);
        brownbutton.setOnClickListener(this);
        graybutton.setOnClickListener(this);
        greenbutton.setOnClickListener(this);
        purplebutton.setOnClickListener(this);
        pinkbutton.setOnClickListener(this);
        whitebutton.setOnClickListener(this);
        yellowbutton.setOnClickListener(this);

        summarybutton.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.redbutton:
                Intent intent1 = new Intent(this, RedPage.class);
                String message1 = "Red Color";
                intent1.putExtra("message", message1);
                startActivity(intent1);
                break;

            // Todo Toasts to be added for new pages/activities

            // todo lesson/page numbers to be added in all modules

            // todo customized list views to be added

            // todo practice test/quiz to be added

            // todo scroll views to be added


            case R.id.bluebutton:
                Intent intent2 = new Intent(this, BluePage.class);
                String message2 = "Blue Color";
                intent2.putExtra("message", message2);
                startActivity(intent2);
                break;

            case R.id.orangebutton:
                Intent intent3 = new Intent(this, OrangePage.class);
                String message3 = "Orange Color";
                intent3.putExtra("message", message3);
                startActivity(intent3);
                break;

            case R.id.blackbutton:
                Intent intent4 = new Intent(this, BlackPage.class);
                String message4 = "Black Color";
                intent4.putExtra("message", message4);
                startActivity(intent4);
                break;

            case R.id.brownbutton:
                Intent intent5 = new Intent(this, BrownPage.class);
                String message5 = "Brown Color";
                intent5.putExtra("message", message5);
                startActivity(intent5);
                break;

            case R.id.graybutton:
                Intent intent6 = new Intent(this, GrayPage.class);
                String message6 = "Gray Color";
                intent6.putExtra("message", message6);
                startActivity(intent6);
                break;

            case R.id.greenbutton:
                Intent intent7 = new Intent(this, GreenPage.class);
                String message7 = "Green Color";
                intent7.putExtra("message", message7);
                startActivity(intent7);
                break;

            case R.id.purplebutton:
                Intent intent8 = new Intent(this, PurplePage.class);
                String message8 = "Purple Color";
                intent8.putExtra("message", message8);
                startActivity(intent8);
                break;

            case R.id.pinkbutton:
                Intent intent9 = new Intent(this, PinkPage.class);
                String message9 = "Pink Color";
                intent9.putExtra("message", message9);
                startActivity(intent9);
                break;

            case R.id.whitebutton:
                Intent intent10 = new Intent(this, WhitePage.class);
                String message10 = "White Color";
                intent10.putExtra("message", message10);
                startActivity(intent10);
                break;

            case R.id.yellowbutton:
                Intent intent11 = new Intent(this, YellowPage.class);
                String message11 = "Yellow Color";
                intent11.putExtra("message", message11);
                startActivity(intent11);
                break;

            case R.id.summarybutton:
                Intent intent12 = new Intent(this, SummaryPage.class);
                String message12 = "Summary Page";
                intent12.putExtra("message", message12);
                startActivity(intent12);
                break;

            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}