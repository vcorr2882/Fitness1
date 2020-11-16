package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class CalvesWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calves_workout3);

        //To access the CalvesWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        CalvesWorkout3ImageAdapter adapter = new CalvesWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}