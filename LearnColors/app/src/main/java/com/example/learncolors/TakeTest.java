package com.example.LearnColors;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TakeTest extends AppCompatActivity {
TextView score;
int[] letterDrawable;
int[] imageDrawable;
ImageView letter;
ImageView[] option;
int ans;
int Total;
int countScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_test);
        score=(TextView) findViewById(R.id.Score);
        letter=(ImageView) findViewById(R.id.Letter);
        Total=countScore=0;
        option=new ImageView[4];
        option[0]=(ImageView) findViewById(R.id.option1);
        option[1]=(ImageView) findViewById(R.id.option2);
        option[2]=(ImageView) findViewById(R.id.option3);
        option[3]=(ImageView) findViewById(R.id.option4);
        letterDrawable=new int[11];
        imageDrawable=new int[11];
        initializeDrawable();
        beginTest();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle state) {
        super.onSaveInstanceState(state);
        state.putString("Score",String.valueOf(countScore));


    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score.setText(savedInstanceState.getString("Score"));
    }

    private void beginTest() {


            int a=0,b=0,c=0,d=0,e=0,f=0;
            a=GenrateNumber(0,10);
            while(b==a)
            {
                b=GenrateNumber(0,10);
            }
            while(c==a || c==b)
            {
                c=GenrateNumber(0,10);
            }
            while(d==a || d==b || d==c)
            {
                d=GenrateNumber(0,10);
            }
            while(e==a || e==b || e==c || e==d)
            {
                e=GenrateNumber(0,10);
            }
            f=GenrateNumber(0,4);
            letter.setImageResource(letterDrawable[a]);
            option[0].setImageResource(imageDrawable[b]);
            option[1].setImageResource(imageDrawable[c]);
            option[2].setImageResource(imageDrawable[d]);
            option[3].setImageResource(imageDrawable[e]);
            option[f].setImageResource(imageDrawable[a]);
            ans=f;


    }

    private int GenrateNumber(int min,int max)
    {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private void  initializeDrawable()
    {
        letterDrawable[0]=R.drawable.redq;
        letterDrawable[1]=R.drawable.greenq;
        letterDrawable[2]=R.drawable.blueq;
        letterDrawable[3]=R.drawable.yellowq;
        letterDrawable[4]=R.drawable.blackq;
        letterDrawable[5]=R.drawable.brownq;
        letterDrawable[6]=R.drawable.orangeq;
        letterDrawable[7]=R.drawable.whiteq;
        letterDrawable[8]=R.drawable.pinkq;
        letterDrawable[9]=R.drawable.purpleq;
        letterDrawable[10]=R.drawable.grayq;


        imageDrawable[0]=R.drawable.reda;
        imageDrawable[1]=R.drawable.greena;
        imageDrawable[2]=R.drawable.bluea;
        imageDrawable[3]=R.drawable.yellowa;
        imageDrawable[4]=R.drawable.blacka;
        imageDrawable[5]=R.drawable.browna;
        imageDrawable[6]=R.drawable.orangea;
        imageDrawable[7]=R.drawable.whitea;
        imageDrawable[8]=R.drawable.pinka;
        imageDrawable[9]=R.drawable.purplea;
        imageDrawable[10]=R.drawable.graya;

    }

    public void onClick(View view) {
        Total=Total+1;
        if(view==option[ans])
        {

           countScore=countScore+1;

        }

        score.setText(String.valueOf(countScore)+" Out of "+ " 5");
        if(Total==5)
        {
            finish();
        }
        beginTest();
    }
}