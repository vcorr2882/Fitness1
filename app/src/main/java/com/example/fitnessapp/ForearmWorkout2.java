package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ForearmWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearm_workout2);

        //To access the ForearmWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ForearmWorkout2ImageAdapter adapter = new ForearmWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}