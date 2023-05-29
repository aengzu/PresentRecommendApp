package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gift_friend_n extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalized_gift_not_friendlist);


        Button self = (Button) findViewById(R.id.self);
        Button make_g = (Button) findViewById(R.id.make_g);

        make_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gamepopup.class);
                startActivity(intent);
            }
        });

    }
}