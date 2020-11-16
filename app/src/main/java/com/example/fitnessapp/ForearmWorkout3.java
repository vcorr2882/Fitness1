package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ForearmWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearm_workout3);

        //To access the ForearmWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ForearmWorkout3ImageAdapter adapter = new ForearmWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}