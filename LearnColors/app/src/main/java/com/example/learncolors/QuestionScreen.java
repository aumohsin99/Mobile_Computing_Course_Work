package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuestionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
    }

}


package com.example.learn_abc;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Learn extends AppCompatActivity implements View.OnClickListener {

    Button btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnH);
        btnI = findViewById(R.id.btnI);
        btnJ = findViewById(R.id.btnJ);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);


        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnJ.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Learn.this, AlphabetScreen.class);
        switch (view.getId()){
            case R.id.btnA:
                intent.putExtra("text","A");
                intent.putExtra("picture", R.drawable.a);
                startActivity(intent);
                break;

            case R.id.btnB:
                intent.putExtra("text","B");
                intent.putExtra("picture", R.drawable.b);
                startActivity(intent);
                break;

            case R.id.btnC:
                intent.putExtra("text","C");
                intent.putExtra("picture", R.drawable.c);
                startActivity(intent);

                break;

            case R.id.btnD:
                intent.putExtra("text","D");
                intent.putExtra("picture", R.drawable.d);
                startActivity(intent);
                break;

            case R.id.btnE:
                intent.putExtra("text","E");
                intent.putExtra("picture", R.drawable.e);
                startActivity(intent);
                break;

            case R.id.btnF:
                intent.putExtra("text","F");
                intent.putExtra("picture", R.drawable.f);
                startActivity(intent);
                break;

            case R.id.btnG:
                intent.putExtra("text","G");
                intent.putExtra("picture", R.drawable.g);
                startActivity(intent);
                break;
            case R.id.btnH:
                intent.putExtra("text","H");
                intent.putExtra("picture", R.drawable.h);
                startActivity(intent);
                break;
            case R.id.btnI:
                intent.putExtra("text","I");
                intent.putExtra("picture", R.drawable.i);
                startActivity(intent);
                break;

            case R.id.btnJ:
                intent.putExtra("text","J");
                intent.putExtra("picture", R.drawable.j);
                startActivity(intent);
                break;
            case R.id.btnK:
                intent.putExtra("text","K");
                intent.putExtra("picture", R.drawable.k);
                startActivity(intent);
                break;
            case R.id.btnL:
                intent.putExtra("text","L");
                intent.putExtra("picture", R.drawable.l);
                startActivity(intent);
                break;
        }


    }
}