package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class gift_friend_y extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_popup);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        ImageView freind1 = (ImageView ) findViewById(R.id.friend1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gift_friend_y.this, giftBox.class);
                startActivity(intent);
                finish();
            }
        });

        //테스트 친구 누르면 상품 추천 화면 뜸
        freind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gift_friend_y.this, RecommendationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    }
