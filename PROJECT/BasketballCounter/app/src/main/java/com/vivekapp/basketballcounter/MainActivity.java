package com.vivekapp.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreView;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreView = (TextView) findViewById(R.id.textView);
        score = 0;

    }
    public void addPoint(View view){
        score = score +1;
        scoreView.setText(String.valueOf(score));
    }
    public void add2Point(View view){
        score = score +2;
        scoreView.setText(String.valueOf(score));
    }
    public void add3Point(View view){
        score = score +3;
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        score = 0;
        scoreView.setText(String.valueOf(score));
    }
}