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
}

