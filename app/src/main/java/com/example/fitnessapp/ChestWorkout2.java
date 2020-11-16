package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ChestWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout2);

        //To access the ChestWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ChestWorkout2ImageAdapter adapter = new ChestWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}