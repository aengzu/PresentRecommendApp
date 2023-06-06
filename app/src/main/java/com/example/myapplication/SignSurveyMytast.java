package com.example.myapplication;

import android.content.Intent;
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

        Button circle = findViewById(R.id.appCompatButton1);
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
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        Button next = (Button) findViewById(R.id.nextbutton);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setSelected(!v.isSelected()); // 선택 여부 반전
                if(set.contains(v.toString())){
                    set.remove(v.toString());
                }else {
                    set.add(v.toString());
                }
            }
        });
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
