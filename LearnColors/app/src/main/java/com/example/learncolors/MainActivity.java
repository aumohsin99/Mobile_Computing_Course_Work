package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.learnbtn);
        Button button2 = (Button) findViewById(R.id.practicebtn);
        Button button3 = (Button) findViewById(R.id.repobutton);

       // button1.setOnClickListener(new View.OnClickListener();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

      //  button1.setOnClickListener((View.OnClickListener) this);
      //  button2.setOnClickListener((View.OnClickListener) this);
    }

    // todo add toasts here for all buttons

    // @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.learnbtn:
                Intent intent1 = new Intent(this, LearnMainScreen.class);
                startActivity(intent1);
                break;
            case R.id.practicebtn:
               Intent intent2 = new Intent(this, PracticeMainScreen.class);
               startActivity(intent2);
                break;

            case R.id.repobutton:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/aumohsin99/LearnColors.git")));
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