package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class BicepsWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_workout3);

        //To access the BicepsWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BicepsWorkout3ImageAdapter adapter = new BicepsWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}