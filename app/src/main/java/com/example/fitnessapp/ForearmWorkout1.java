package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ForearmWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearm_workout1);

        //To access the ForearmWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ForearmWorkout1ImageAdapter adapter = new ForearmWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}