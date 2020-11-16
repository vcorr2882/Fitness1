package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TricepsWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_workout2);

        //To access the TricepsWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        TricepsWorkout2ImageAdapter adapter = new TricepsWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}