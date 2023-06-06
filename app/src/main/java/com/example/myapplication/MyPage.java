package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyPage extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytaste);
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
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
                UserAccount user = snapshot.getValue(UserAccount.class);
            }//onDataChange
            @Override
            public void onCancelled(@NonNull DatabaseError error) { }//onCancelled
        });//addValueEventListener

    // 데이터베이스 읽기 #2. Single ValueEventListener

        FirebaseDatabase.getInstance().getReference().addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                Log.d("MainActivity", "Single ValueEventListener : " + snapshot.getValue());
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

        }
    });

    // 데이터베이스 읽기 #3. ChildEventListener
        FirebaseDatabase.getInstance().getReference().addChildEventListener(new ChildEventListener() {
        @Override
        public void onChildAdded(DataSnapshot dataSnapshot, String s) {
            Log.d("MainActivity", "ChildEventListener - onChildAdded : " + dataSnapshot.getValue());
        }

        @Override
        public void onChildChanged(DataSnapshot dataSnapshot, String s) {
            Log.d("MainActivity", "ChildEventListener - onChildChanged : " + s);
        }

        @Override
        public void onChildRemoved(DataSnapshot dataSnapshot) {
            Log.d("MainActivity", "ChildEventListener - onChildRemoved : " + dataSnapshot.getKey());
        }

        @Override
        public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            Log.d("MainActivity", "ChildEventListener - onChildMoved" + s);
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Log.d("MainActivity", "ChildEventListener - onCancelled" + databaseError.getMessage());
        }
    });
}
}



