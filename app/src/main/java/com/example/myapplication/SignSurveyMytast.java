package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Set;

// 내 취향 요소 선택시 버튼 activated 되는 거랑, 해당 선택 요소들 유저-취향 데이터베이스에 추가하는 이벤트 구현해야함.
public class SignSurveyMytast extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference reference;
    Set<String> set;
// 가입 시 설문 - 내 취향

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_survey_mytaste);

        Button circle1 = findViewById(R.id.appCompatButton_1);
        Button circle2 = findViewById(R.id.appCompatButton_2);
        Button circle3 = findViewById(R.id.appCompatButton_3);
        Button circle4 = findViewById(R.id.appCompatButton_4);
        Button circle5 = findViewById(R.id.appCompatButton_5);
        Button circle6 = findViewById(R.id.appCompatButton_6);
        Button circle7 = findViewById(R.id.appCompatButton_7);
        Button circle8 = findViewById(R.id.appCompatButton_8);
        Button circle9 = findViewById(R.id.appCompatButton_9);
        Button circle10 = findViewById(R.id.appCompatButton_10);
        Button circle11 = findViewById(R.id.appCompatButton_11);
        Button circle12 = findViewById(R.id.appCompatButton_12);
        Button circle13 = findViewById(R.id.appCompatButton_13);
        Button circle14 = findViewById(R.id.appCompatButton_14);
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        Button next = (Button) findViewById(R.id.nextbutton);

        circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle1.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle2.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle3.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle4.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle5.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle6.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle7.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle8.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle9.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle10.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle11.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle12.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle13.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle14.setBackgroundResource(R.drawable.circle_active);
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });

        //다음으로 버튼 클릭시 설문조사 -> 메인화면 이동
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음으로 버튼 클릭시 메인화면 이동
                reference = database.getReference();
                for(String s:set) {
                    reference.child(firebaseAuth.getCurrentUser().getEmail()).child("taste").child(s).setValue(s);
                }
                Intent intent = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }



}
