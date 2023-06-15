package com.example.myapplication;

import com.example.myapplication.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //메인화면에서 버튼 클릭시 다른 화면들 넘어가는 이벤트 구현하기

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        ImageButton gift_box = (ImageButton) findViewById(R.id.box_img);
        Button friend_box = (Button) findViewById(R.id.friendlist_btn);
        Button mypage_box = (Button) findViewById(R.id.mypage_btn);
        Button bg_box = (Button) findViewById(R.id.bg_btn);
        Button mg_box = (Button) findViewById(R.id.mg_bt);

        //선물 박스 클릭 시 페이지 이동 이벤트
        gift_box.setOnClickListener(new View.OnClickListener() { // 선물 박스
            @Override
            public void onClick(View v) {
                //선물박스 관련 자바클래스 만들고 수정하기
                Intent intent = new Intent(getApplicationContext(), giftBox.class);
                startActivity(intent);
                finish();
            }
        });

        // 미니게임 클릭 시 페이지 이동 이벤트
        mg_box.setOnClickListener(new View.OnClickListener() { // 미니게임박스
            @Override
            public void onClick(View v) {
                //선물 이상ㅎ여 월드컵 관련 자바클래스 만들고 수정하기
                Intent intent = new Intent(getApplicationContext(), BalanceGame.class);
                startActivity(intent);
                finish();
            }
        });

        bg_box.setOnClickListener(new View.OnClickListener() { // 밸런스 게임 박스
            @Override
            public void onClick(View v) {
                //밸런스게임 관련 자바클래스 만들고 수정하기
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hwaiiteam.com"));
                startActivity(intent);

                finish();

            }
        });

        // 친구 목록 페이지 이동 이벤트
        friend_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //친구 목록 자바클래스 만들고 수정하기
                Intent intent = new Intent(getApplicationContext(), friendlist.class);
                startActivity(intent);
                finish();
            }
        });

        // 마이페이지 페이지 이동 이벤트
        mypage_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}