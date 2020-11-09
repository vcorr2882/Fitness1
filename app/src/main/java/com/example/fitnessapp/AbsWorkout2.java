package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
;

public class AbsWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_workout2);

        //To access the AbsWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        AbsWorkout2ImageAdapter adapter = new AbsWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}