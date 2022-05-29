package com.example.photoframeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"1", "2", "3", "4", "5" };
   // Button prevbutton, next;
    ImageButton prev, next;
    ImageView frame;
    TextView filenm;
    int currentImage=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void prev(View v)
    {
        filenm= findViewById(R.id.filenm);
        String idx = "frame" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id", getPackageName());
        frame = findViewById(x);
        frame.setAlpha(0f);

        currentImage=(5+currentImage-1)%5;

        String idy = "frame" + currentImage;
        int y = this.getResources().getIdentifier(idy,"id", getPackageName());
        frame = findViewById(y);
        frame.setAlpha(1f);
        filenm.setText(names[currentImage]);
    }

    public void next(View v)
    {
        filenm= findViewById(R.id.filenm);
        String idx = "frame" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id", getPackageName());
        frame = findViewById(x);
        frame.setAlpha(0f);

        currentImage=(5+currentImage+1)%5;

        String idy = "frame" + currentImage;
        int y = this.getResources().getIdentifier(idy,"id", getPackageName());
        frame = findViewById(y);
        frame.setAlpha(1f);

        filenm.setText(names[currentImage]);

    }
}