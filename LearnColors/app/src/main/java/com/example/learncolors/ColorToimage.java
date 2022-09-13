package com.example.LearnColors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ColorToimage extends AppCompatActivity {
ImageView Iv;
int[] myImageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albhabet_toimage);
        Iv=(ImageView)findViewById(R.id.imageView);
        Intent intent1=getIntent();
        myImageList=new int[11];
        imageInitialize();
        String i=intent1.getStringExtra("ImageIndex");
        int index= Integer.parseInt(i);
        Iv.setImageResource(myImageList[index]);


    }
    private  void imageInitialize()
    {
        myImageList[0]=R.drawable.redimg;
        myImageList[1]=R.drawable.greenimg;
        myImageList[2]=R.drawable.blueimg;
        myImageList[3]=R.drawable.yellowimg;
        myImageList[4]=R.drawable.blackimg;
        myImageList[5]=R.drawable.brownimg;
        myImageList[6]=R.drawable.orangeimg;
        myImageList[7]=R.drawable.whiteimg;
        myImageList[8]=R.drawable.pinkimg;
        myImageList[9]=R.drawable.purpleimg;
        myImageList[10]=R.drawable.grayimg;

    }
}