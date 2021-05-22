package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a_score = 0;
    int b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayScoreA (int i)
    {
        TextView dsp = findViewById(R.id.scoreA);
        dsp.setText(String.valueOf(i));
    }
    public void displayScoreB (int i)
    {
        TextView dsp = findViewById(R.id.scoreB);
        dsp.setText(""+i);
    }


    public void add3(View view) {
        a_score += 3;
        displayScoreA(a_score);

    }

    public void add3B(View view) {
        b_score += 3;
        displayScoreB(b_score);
    }
    public void add2(View view) {
        a_score += 2;
        displayScoreA(a_score);

    }

    public void add2B(View view) {
        b_score += 2;
        displayScoreB(b_score);
    }

    public void ft(View view) {
        a_score += 1;
        displayScoreA(a_score);

    }

    public void ftb(View view) {
        b_score += 1;
        displayScoreB(b_score);
    }

    public void reset(View view) {
        a_score = 0;
        b_score = 0;
        displayScoreA(a_score);
        displayScoreB(b_score);

    }
}