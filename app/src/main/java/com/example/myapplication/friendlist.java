package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class friendlist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_list);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        ImageView freind1 = (ImageView ) findViewById(R.id.friend1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(friendlist.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //테스트 친구 누르면 친구의 취향 창 이동
        freind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(friendlist.this, friend_page.class);
                startActivity(intent);
            }
        });
    }
}
