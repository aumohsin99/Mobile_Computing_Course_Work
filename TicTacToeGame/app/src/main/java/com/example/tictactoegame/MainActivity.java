package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // player representation
    // 0 - o
    // 1 - X
    // State Management
    int activeplayer =0;
    int[] gamestate={2,2,2,2,2,2,2,2,2};
    // 2 - Null
    // 1 - X
    // 0 - o

    int[][] winPositions = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6}, {1,4,7}, {2,5,8},
            {0,4,8}, {2,4,6} };


    public void PlayerTap(View view)
    {
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if (gamestate[tappedImage]==2)
        {
            gamestate[tappedImage]=activeplayer;
            img.setTranslationY(-1000f);
            if (activeplayer==0)
            {
                img.setImageResource(R.drawable.o);
                activeplayer=1;
            }
            else
            {
                img.setImageResource(R.drawable.x);
                activeplayer=0;
            }

            img.animate().translationYBy(1000f).setDuration(300);
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}