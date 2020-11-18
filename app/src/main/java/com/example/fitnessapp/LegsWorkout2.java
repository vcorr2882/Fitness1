package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class LegsWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_workout2);

        //To access the LegsWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        LegsWorkout2ImageAdapter adapter = new LegsWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}