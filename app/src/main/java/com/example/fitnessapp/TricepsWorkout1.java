package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TricepsWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_workout1);

        //To access the TricepsWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        TricepsWorkout1ImageAdapter adapter = new TricepsWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}