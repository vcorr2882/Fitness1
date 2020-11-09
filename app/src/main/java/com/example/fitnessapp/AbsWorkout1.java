package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;


public class AbsWorkout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_workout1);
            //To access the AbsWorkout1ImageAdapter
            ViewPager viewPager = findViewById(R.id.viewPager);
            AbsWorkout1ImageAdapter adapter = new AbsWorkout1ImageAdapter(this);
            viewPager.setAdapter(adapter);


    }
}