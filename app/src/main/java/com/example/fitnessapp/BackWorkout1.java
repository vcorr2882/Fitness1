package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class BackWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workout1);

        //To access the BackWorkout1ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BackWorkout1ImageAdapter adapter = new BackWorkout1ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}