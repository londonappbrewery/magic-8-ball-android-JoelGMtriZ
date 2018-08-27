package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton magic8ballImgBtn;

    int [] magic8bal = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magic8ballImgBtn = (ImageButton) findViewById(R.id.magic8ballimgBtn);

        magic8ballImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random numrand = new Random();

                int num = numrand.nextInt(5);

                magic8ballImgBtn.setImageResource(magic8bal[num]);

            }
        });
    }
}
