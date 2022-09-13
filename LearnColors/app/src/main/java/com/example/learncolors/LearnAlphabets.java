package com.example.LearnColors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnColors extends AppCompatActivity {
    Button[] buttons;
    int[] BUTTON_IDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_colors);
        buttons= new Button[11];

        BUTTON_IDS= new int[11];
        BUTTON_IDS[0]=R.id.Red;
        BUTTON_IDS[1]=(R.id.Green);
        BUTTON_IDS[2]=(R.id.Blue);
        BUTTON_IDS[3]=(R.id.Brown);
        BUTTON_IDS[4]=(R.id.Yellow);
        BUTTON_IDS[5]=(R.id.Black);
        BUTTON_IDS[6]=(R.id.Orange);
        BUTTON_IDS[7]=(R.id.White);
        BUTTON_IDS[8]=(R.id.Pink);
        BUTTON_IDS[9]=(R.id.Purple);
        BUTTON_IDS[10]=(R.id.Gray);

        initialize();




    }
    private  void initialize()
    {
        for(int i=0;i<11;i++)
        {
            buttons[i]=(Button) findViewById(BUTTON_IDS[i]);
        }
        //there were app crashing thats why i have to loop to 14 and then 10

    }


    public void onClick(View view) {
        Intent intent=new Intent(LearnColors.this,AlbhabetToimage.class);
        for(int i=0;i<11;i++)
        {
            if(view.getId()==BUTTON_IDS[i])
            {
                String val= String.valueOf(i);
                intent.putExtra("ImageIndex",val);
                startActivity(intent);
            }
        }
    }

}