package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
public class SelfSelection2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_reccommend_2);

        Button next = (Button) findViewById(R.id.nextbutton);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        Intent secondIntent = getIntent();
        String MBTI = secondIntent.getStringExtra("MBTI");
        String age = secondIntent.getStringExtra("age");
        String sex = secondIntent.getStringExtra("sex");



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelfSelection2.this, SellfSelection.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //상품추천 화면으로 이동
                Intent intent = new Intent(SelfSelection2.this, SelfSelection3.class);
                startActivity(intent);
                // 선택한 MBTI, age, sex 값 넘겨주기
                intent.putExtra("MBTI", MBTI);
                intent.putExtra("age", age);
                intent.putExtra("sex", sex);

                finish();

            }
        });
    }
}