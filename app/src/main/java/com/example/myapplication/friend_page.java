package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class friend_page extends AppCompatActivity {
    @Override

    //친구 테스트 케이스로 한명 띄웠어요.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytaste);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(friend_page.this, friendlist.class);
                startActivity(intent);
            }
        });

        TextView name_text2 = findViewById(R.id.user_name);
        TextView age_text = findViewById(R.id.age_textview);
        TextView name_text = findViewById(R.id.name_text);
        TextView MBTI_text = findViewById(R.id.mbti_textview);
        TextView sex_text = findViewById(R.id.sex_textview);

        age_text.setText("23");
        MBTI_text.setText("ENFJ");
        sex_text.setText("남성");
        name_text.setText("홍길동");
        name_text2.setText("홍길동");


    }
}