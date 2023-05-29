package com.example.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gift_friend_n extends AppCompatActivity {
    Dialog dialog01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalized_gift_not_friendlist);

        dialog01 = new Dialog(gift_friend_n.this);
        dialog01.setContentView(R.layout.game_popup);

        findViewById(R.id.make_g).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showDialog01(); // 아래 showDialog01() 함수 호출
            }
        });

        // dialog01을 디자인하는 함수


        Button self = (Button) findViewById(R.id.self);
        Button make_g = (Button) findViewById(R.id.make_g);

        make_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gift_friend_n.class);
                startActivity(intent);
            }
        });

    }
    public void showDialog01() {
        dialog01.show(); // 다이얼로그 띄우기

        /* 이 함수 안에 원하는 디자인과 기능을 구현하면 된다. */

        // 위젯 연결 방식은 각자 취향대로~
        // '아래 아니오 버튼'처럼 일반적인 방법대로 연결하면 재사용에 용이하고,
        // '아래 네 버튼'처럼 바로 연결하면 일회성으로 사용하기 편함.
        // *주의할 점: findViewById()를 쓸 때는 -> 앞에 반드시 다이얼로그 이름을 붙여야 한다.

        // 아니오 버튼
        Button linkbtn = dialog01.findViewById(R.id.link_btn);
        linkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 원하는 기능 구현
                dialog01.dismiss(); // 다이얼로그 닫기
            }
        });
        // 네 버튼
        dialog01.findViewById(R.id.kakao_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 원하는 기능 구현
                finish();           // 앱 종료
            }
        });
    }
}


