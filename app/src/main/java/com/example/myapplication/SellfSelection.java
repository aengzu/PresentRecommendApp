package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class SellfSelection extends AppCompatActivity {
        String sex;
        String MBTI;
        String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_reccommend_1);

        ImageView backButton = (ImageView) findViewById(R.id.backButton);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellfSelection.this, gift_friend_n.class);
                startActivity(intent);
            }
        });

        RadioButton male = (RadioButton) findViewById(R.id.male);
        RadioButton female = (RadioButton) findViewById(R.id.female);
        RadioButton no_choice = (RadioButton) findViewById(R.id.no_choice);

        EditText editTextAge = (EditText) findViewById(R.id.editTextAge);
        EditText editTextMBTI = (EditText) findViewById(R.id.MBTI);

        Button next = (Button) findViewById(R.id.nextbutton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(male.isChecked()){
                    //성별-남자
                    sex = male.getText().toString();
                }else if(female.isChecked()){
                    //성별-여자
                    sex = female.getText().toString();
                }else if(no_choice.isChecked()){
                    sex = no_choice.getText().toString();
                }
                MBTI = editTextMBTI.getText().toString().toUpperCase();
                age = editTextAge.getText().toString();

                UserAccount user = new UserAccount("selfinput@self.com","selfinput",age,sex,MBTI);

                Intent intent = new Intent(SellfSelection.this, SelfSelection2.class);
                intent.putExtra("MBTI",MBTI);
                intent.putExtra("age",age);
                intent.putExtra("sex",sex);

                startActivity(intent);
                finish();

            }
        });


    }
}
