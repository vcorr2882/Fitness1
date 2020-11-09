package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class AbsWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_workout3);


        //To access the AbsWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        AbsWorkout3ImageAdapter adapter = new AbsWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}