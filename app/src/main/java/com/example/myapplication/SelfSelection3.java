package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class SelfSelection3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_recommend_3);

        Button next = (Button) findViewById(R.id.nextbutton);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);


        Button circle1 = findViewById(R.id.appCompatButton1);
        Button circle2 = findViewById(R.id.appCompatButton2);
        Button circle3 = findViewById(R.id.appCompatButton3);
        Button circle4 = findViewById(R.id.appCompatButton4);
        Button circle5 = findViewById(R.id.appCompatButton5);
        Button circle6 = findViewById(R.id.appCompatButton6);
        Button circle7 = findViewById(R.id.appCompatButton7);
        Button circle8 = findViewById(R.id.appCompatButton8);
        Button circle9 = findViewById(R.id.appCompatButton9);
        Button circle10 = findViewById(R.id.appCompatButton10);
        Button circle11 = findViewById(R.id.appCompatButton11);
        Button circle12 = findViewById(R.id.appCompatButton12);
        Button circle13 = findViewById(R.id.appCompatButton13);
        Button circle14 = findViewById(R.id.appCompatButton14);
        Button circle15 = findViewById(R.id.appCompatButton15);
        Button circle16 = findViewById(R.id.appCompatButton16);
        Button circle17 = findViewById(R.id.appCompatButton17);
        Button circle18 = findViewById(R.id.appCompatButton18);
        Button circle19 = findViewById(R.id.appCompatButton19);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelfSelection3.this, SelfSelection2.class);
                startActivity(intent);
            }
        });
        circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전
            }
        });
        circle12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });
        circle19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setSelected(true); // 선택 여부 반전

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //상품추천 화면으로 이동
                Intent intent = new Intent(SelfSelection3.this, RecommendationActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}