package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class gift_friend_n extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalized_gift_not_friendlist);

        ImageView backButton = (ImageView) findViewById(R.id.backButton);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gift_friend_n.this, giftBox.class);
                startActivity(intent);
            }
        });

        Button self = (Button) findViewById(R.id.self);
        Button make_g = (Button) findViewById(R.id.make_g);

        //밸런스게임 전송하기 클릭시
        make_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hwaiiteam.com"));
                startActivity(intent);

                finish();
            }
        });


        //직접 정보 선택하기 클릭시
        self.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SellfSelection.class);
                startActivity(intent);
            }
        });

    }
}