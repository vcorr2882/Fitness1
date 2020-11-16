package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class CalvesWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calves_workout1);

        //To access the CalvesWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        CalvesWorkout1ImageAdapter adapter = new CalvesWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}