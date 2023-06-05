package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signUpActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference reference;


    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextAge;
    private EditText editTextMBTI;
    private EditText editTextName;
    private Button buttonJoin;
    RadioGroup genderGroup;
    RadioButton male;
    RadioButton female;
    RadioButton no_check;
    String sex;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        firebaseAuth = FirebaseAuth.getInstance();

        editTextEmail = (EditText) findViewById(R.id.edittext_email);
        editTextPassword = (EditText) findViewById(R.id.user_pwd);
        editTextName = (EditText) findViewById(R.id.name);
        editTextAge = (EditText) findViewById(R.id.age);
        editTextMBTI = (EditText) findViewById(R.id.MBTI);
        genderGroup = (RadioGroup) findViewById(R.id.gendergroup);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        no_check = findViewById(R.id.gender_no_check);



        database = FirebaseDatabase.getInstance();
        reference = database.getReference();





        buttonJoin = (Button) findViewById(R.id.signUpButton);
        buttonJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editTextEmail.getText().toString().equals("") && !editTextPassword.getText().toString().equals("")) {
                    // 이메일과 비밀번호가 공백이 아닌 경우
                    String email = editTextEmail.getText().toString();
                    String password = editTextPassword.getText().toString();
                    String name = editTextName.getText().toString();
                    String MBTI = editTextMBTI.getText().toString().toUpperCase();
                    String age = editTextAge.getText().toString();
                    if(male.isChecked()){
                        //성별-남자
                        sex = male.getText().toString();
                    }else if(female.isChecked()){
                        //성별-여자
                        sex = female.getText().toString();
                    }else if(no_check.isChecked()){
                        sex = no_check.getText().toString();
                    }




                    createUser(email, password, name, age, sex, MBTI);


                } else {
                    // 이메일과 비밀번호가 공백인 경우
                    Toast.makeText(signUpActivity.this, "계정과 비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void createUser(String email, String password, String name, String age, String gender, String MBTI) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            // 회원가입 성공시
                            Toast.makeText(signUpActivity.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                            //가입 성공 시 가입 시 설문- 내 취향으로 이동

                            UserAccount usr = new UserAccount(email, name, age, sex, MBTI);


                            reference.child(name).child("email").setValue(email);
                            reference.child(name).child("age").setValue(age);
                            reference.child(name).child("MBTI").setValue(MBTI);
                            reference.child(name).child("sex").setValue(sex);

                            Intent intent = new Intent(signUpActivity.this, SignSurveyMytast.class);
                            startActivity(intent);
                            finish();
                        } else {
                            // 계정이 중복된 경우
                            task.getException().getMessage();
                            Toast.makeText(signUpActivity.this, "이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }
}