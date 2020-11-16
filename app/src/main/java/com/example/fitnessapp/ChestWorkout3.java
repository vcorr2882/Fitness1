package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ChestWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout3);

        //To access the ChestWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        ChestWorkout3ImageAdapter adapter = new ChestWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}