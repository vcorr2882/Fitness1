package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class BackWorkout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workout3);

        //To access the BackWorkout3ImageAdapter
        ViewPager viewPager = findViewById(R.id.viewPager);
        BackWorkout3ImageAdapter adapter = new BackWorkout3ImageAdapter(this);
        viewPager.setAdapter(adapter);


    }
}