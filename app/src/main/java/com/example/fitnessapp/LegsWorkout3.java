package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class LegsWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_workout3);

        //To access the LegsWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        LegsWorkout3ImageAdapter adapter = new LegsWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}