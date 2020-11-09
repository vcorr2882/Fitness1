package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private LinearLayout linearLayout1;
    private ImageButton imageButton2;
    private LinearLayout linearLayout2;
    private ImageButton imageButton3;
    private LinearLayout linearLayout3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Code for intent on button1 and linear layout1
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        linearLayout1 = findViewById(R.id.linearlayout1);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });


        //Code for intent on button2 and linear layout2
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        linearLayout2 = findViewById(R.id.linearlayout2);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        //Code for intent on button3 and linear layout3
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        linearLayout3= findViewById(R.id.linearlayout3);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


    }

    //Method for intent on button1 and linear layout1
    public void openActivity1() {
        Intent intent = new Intent(this, AbsMain.class);
        startActivity(intent);
    }
    //Method for intent on button2 and linear layout2
    public void openActivity2() {
        Intent intent = new Intent(this, BackMain.class);
        startActivity(intent);
    }
    //Method for intent on button3 and linear layout3
    public void openActivity3() {
        Intent intent = new Intent(this, BicepsMain.class);
        startActivity(intent);
    }





    }




