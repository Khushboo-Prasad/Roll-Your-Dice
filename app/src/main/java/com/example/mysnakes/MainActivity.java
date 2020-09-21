package com.example.mysnakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDices={
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6

    };
    public  void rollTapped(View view){
        Random ran =new Random();
        int randomnumber=ran.nextInt(6);
        Log.i("Random","Randomnumber is "+randomnumber);
        ImageView dice=(ImageView)findViewById(R.id.dice);
        dice.setImageResource(myDices[randomnumber]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
