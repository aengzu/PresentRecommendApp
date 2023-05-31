package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MiniGame extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_back;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minigame);
        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
