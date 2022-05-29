package com.example.photoframeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button prevbutton, nextbutton;
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
        String idx = "i" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id", getPackageName());
        frame = findViewById(x);
        frame.setAlpha(0f);

        currentImage=(5+currentImage-1)%5;

        String idy = "i" + currentImage;
        int y = this.getResources().getIdentifier(idy,"id", getPackageName());
        frame = findViewById(y);
        frame.setAlpha(1f);

    }

    public void next(View v)
    {
        String idx = "i" + currentImage;
        int x = this.getResources().getIdentifier(idx,"id", getPackageName());
        frame = findViewById(x);
        frame.setAlpha(0f);

        currentImage=(5+currentImage+1)%5;

        String idy = "i" + currentImage;
        int y = this.getResources().getIdentifier(idy,"id", getPackageName());
        frame = findViewById(y);
        frame.setAlpha(1f);
    }
}