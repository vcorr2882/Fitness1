package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ShouldersWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders_workout2);

        //To access the ShouldersWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ShouldersWorkout2ImageAdapter adapter = new ShouldersWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}