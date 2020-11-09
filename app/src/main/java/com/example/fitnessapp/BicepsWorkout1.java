package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class BicepsWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_workout1);

        //To access the BicepsWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BicepsWorkout1ImageAdapter adapter = new BicepsWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}