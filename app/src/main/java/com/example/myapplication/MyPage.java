package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MyPage extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
    UserAccount user = new UserAccount();

    DatabaseReference myRef = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytaste);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        user.setUid(currentUser.getUid());
        TextView name_text2 = findViewById(R.id.user_name);
        TextView age_text = findViewById(R.id.age_textview);
        TextView name_text = findViewById(R.id.name_text);
        TextView MBTI_text = findViewById(R.id.mbti_textview);
        TextView sex_text = findViewById(R.id.sex_textview);
     backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //데이터베이스 읽기 #1
        myRef.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String age = (String)snapshot.child("users").child(currentUser.getUid()).child("age").getValue();
                String MBTI = (String)snapshot.child("users").child(currentUser.getUid()).child("MBTI").getValue();
                String sex =(String)snapshot.child("users").child(currentUser.getUid()).child("sex").getValue();
                String name =(String)snapshot.child("users").child(currentUser.getUid()).child("name").getValue();
                age_text.setText(age);
                MBTI_text.setText(MBTI);
                sex_text.setText(sex);
                name_text.setText(name);
                user.setAge(age);
                user.setGender(sex);
                user.setName(name);
                user.setMBTI(MBTI);
                name_text2.setText(name);
            }//onDataChange
            @Override
            public void onCancelled(@NonNull DatabaseError error) { }//onCancelled
        });//addValueEventListener

    // 데이터베이스 읽기 #2. Single ValueEventListener








}}



