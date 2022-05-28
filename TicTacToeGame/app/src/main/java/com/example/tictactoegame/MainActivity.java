package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    boolean gameActive=true;

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
        if (!gameActive)
        {
            gameReset(view);
        }

        if (gamestate[tappedImage]==2)
        {
            gamestate[tappedImage]=activeplayer;
            img.setTranslationY(-1000f);
            if (activeplayer==0)
            {
                img.setImageResource(R.drawable.o);
                activeplayer=1;
                TextView status = findViewById(R.id.status);
                status.setText("X's Turn Now");
            }
            else
            {
                img.setImageResource(R.drawable.x);
                activeplayer=0;
                TextView status = findViewById(R.id.status);
                status.setText("O's Turn Now");
            }

            img.animate().translationYBy(1000f).setDuration(300);
        }

        // checking if someone won
        for (int[] winpostion: winPositions)
        {
            if (gamestate[winpostion[0]] == gamestate[winpostion[1]] &&
                    gamestate[winpostion[1]] == gamestate[winpostion[2]] && gamestate[winpostion[0]] != 2)
            {
                String winnerStr;
                gameActive = false;
                if (gamestate[winpostion[0]] == 0)
                {
                    winnerStr = "Player 0 won!";
                } else
                {
                    winnerStr = "Player X won!";
                }

                TextView status = findViewById(R.id.status);
                status.setText(winnerStr);

            }
        }
    }

    public void gameReset(View view)
    {
        gameActive=true;
        activeplayer=0;
        for (int i=0; i< gamestate.length; i++)
        {
            gamestate[i]=2;
        }
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}