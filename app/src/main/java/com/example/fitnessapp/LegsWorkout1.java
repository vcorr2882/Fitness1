package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class LegsWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_workout1);

        //To access the LegsWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        LegsWorkout1ImageAdapter adapter = new LegsWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}