package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ShouldersWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders_workout3);

        //To access the ShouldersWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ShouldersWorkout3ImageAdapter adapter = new ShouldersWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}