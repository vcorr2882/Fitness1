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
    private ImageButton imageButton4;
    private LinearLayout linearLayout4;
    private ImageButton imageButton5;
    private LinearLayout linearLayout5;
    private ImageButton imageButton6;
    private LinearLayout linearLayout6;
    private ImageButton imageButton7;
    private LinearLayout linearLayout7;
    private ImageButton imageButton8;
    private LinearLayout linearLayout8;
    private ImageButton imageButton9;
    private LinearLayout linearLayout9;


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


        //Code for intent on button4 and linear layout4
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        linearLayout4= findViewById(R.id.linearlayout4);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });


        //Code for intent on button5 and linear layout5
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        linearLayout5 = findViewById(R.id.linearlayout5);
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


        //Code for intent on button6 and linear layout6
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        linearLayout6 = findViewById(R.id.linearlayout6);
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });


        //Code for intent on button7 and linear layout7
        imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
        linearLayout7 = findViewById(R.id.linearlayout7);
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });


        //Code for intent on button8 and linear layout8
        imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
        linearLayout8 = findViewById(R.id.linearlayout8);
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });


        //Code for intent on button9 and linear layout9
        imageButton9 = findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });
        linearLayout9 = findViewById(R.id.linearlayout9);
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
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
    //Method for intent on button4 and linear layout4
    public void openActivity4() {
        Intent intent = new Intent(this, CalvesMain.class);
        startActivity(intent);
    }
    //Method for intent on button5 and linear layout5
    public void openActivity5() {
        Intent intent = new Intent(this, ChestMain.class);
        startActivity(intent);
    }
    //Method for intent on button6 and linear layout6
    public void openActivity6() {
        Intent intent = new Intent(this, ForearmMain.class);
        startActivity(intent);
    }
    //Method for intent on button7 and linear layout7
    public void openActivity7() {
        Intent intent = new Intent(this, LegsMain.class);
        startActivity(intent);
    }
    //Method for intent on button8 and linear layout8
    public void openActivity8() {
        Intent intent = new Intent(this, ShouldersMain.class);
        startActivity(intent);
    }
    //Method for intent on button9 and linear layout9
    public void openActivity9() {
        Intent intent = new Intent(this, TricepsMain.class);
        startActivity(intent);
    }





}




