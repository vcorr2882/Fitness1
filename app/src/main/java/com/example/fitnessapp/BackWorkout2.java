package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class BackWorkout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workout2);

        //To access the BackWorkout2ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BackWorkout2ImageAdapter adapter = new BackWorkout2ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}