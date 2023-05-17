package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageButton btn = (ImageButton) findViewById(R.id.view9);
        ImageButton btn2 = (ImageButton) findViewById(R.id.view10);
        ImageButton btn3 = (ImageButton) findViewById(R.id.view11);
        ImageButton btn4 = (ImageButton) findViewById(R.id.view8);

        TextView tv = (TextView) findViewById(R.id.textView4);
        TextView tv2 = (TextView) findViewById(R.id.textView6);
        TextView tv3 = (TextView) findViewById(R.id.textView3);


    }

    }
