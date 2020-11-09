package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class BicepsWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_workout2);

        //To access the BicepsWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BicepsWorkout2ImageAdapter adapter = new BicepsWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}