package com.example.LearnColors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{
Button repo,learn,takeTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo=(Button) findViewById(R.id.Repo);
        learn=(Button) findViewById(R.id.Learn);
        takeTest=(Button) findViewById(R.id.Test);
    }
    public void onClick(View view) {
        if(view.getId()==R.id.Repo)
        {
            String url= "https://github.com/aumohsin99/LearnColors";
            Uri uri= Uri.parse(url);
            Intent intent2=new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent2);
        }else if(R.id.Learn==view.getId())
        {
            Intent intent2=new Intent(MainActivity.this,LearnColors.class);
            startActivity(intent2);
        }else if(R.id.Test==view.getId())
        {
            Intent intent2=new Intent(MainActivity.this,TakeTest.class);
            startActivity(intent2);
        }
    }


}