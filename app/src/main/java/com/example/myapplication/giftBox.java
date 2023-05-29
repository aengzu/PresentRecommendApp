package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class giftBox extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalized_gift_selelct);

        Button friend_y = (Button) findViewById(R.id.friendlist_y);
        Button friend_n = (Button) findViewById(R.id.self);

        friend_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gift_friend_n.class);
                startActivity(intent);
            }
        });
    }
}
