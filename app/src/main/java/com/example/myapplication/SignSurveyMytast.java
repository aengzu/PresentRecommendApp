package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// 내 취향 요소 선택시 버튼 activated 되는 거랑, 해당 선택 요소들 유저-취향 데이터베이스에 추가하는 이벤트 구현해야함.
public class SignSurveyMytast extends AppCompatActivity {
// 가입 시 설문 - 내 취향
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_survey_mytaste);


        Button next = (Button) findViewById(R.id.nextbutton5);


        //다음으로 버튼 클릭시 설문조사 -> 메인화면 이동
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음으로 버튼 클릭시 메인화면 이동
                Intent intent = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }




}
