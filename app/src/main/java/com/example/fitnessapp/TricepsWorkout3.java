package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TricepsWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_workout3);

        //To access the TricepsWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        TricepsWorkout3ImageAdapter adapter = new TricepsWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}