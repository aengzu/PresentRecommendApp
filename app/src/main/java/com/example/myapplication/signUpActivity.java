package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class signUpActivity extends AppCompatActivity {
    private static final String TAG = "SignUpActivity";
    private FirebaseAuth mAuth; //firebase 인증처리
    private DatabaseReference mDatabaseRef; // firebase 실시간 데이타베이스
    private EditText mEtEmail, mEtPwd, mEtName, mEtMBTI, mEtAge, mEtPwdCT; //회원가입 입력필드

    private RadioGroup gender; //성별 radiobutton
    private Button sign_up; //회원가입 버튼


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        mAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("example");

        mEtEmail = findViewById(R.id.edittext_email);
        mEtPwd = findViewById(R.id.edittext_password);
        mEtMBTI = findViewById(R.id.MBTI);
        mEtName = findViewById(R.id.name);
        mEtAge = findViewById(R.id.age);

        sign_up = findViewById(R.id.signUpButton);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //회원가입 처리 시작
                String strEmail = mEtEmail.getText().toString();
                //비밀번호 확인 과 동일한지 확인하는 작업 아직 구현 x
                String strPwd = mEtPwd.getText().toString();
                String strPwdCt = mEtPwdCT.getText().toString();

                String strName = mEtName.getText().toString();
                int intage = Integer.parseInt(mEtAge.getText().toString());
                String strMBTI = mEtMBTI.getText().toString();

                if (strPwd == strPwdCt) {
                    mAuth.createUserWithEmailAndPassword(strEmail, strPwd).addOnCompleteListener(signUpActivity.this,
                            new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                                        UserAccount account = new UserAccount();
                                        account.setIdToken(firebaseUser.getUid());
                                        account.setEmailId(firebaseUser.getEmail());
                                        account.setPassword(strPwd);

                                        mDatabaseRef.child("UserAccount").child(firebaseUser.getUid()).setValue(account);

                                        Toast.makeText(signUpActivity.this, "회원가입이 완료되었습니다!", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(signUpActivity.this, "회원가입에 실패하셨습니다.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                } else {
                    Toast myToast = Toast.makeText(signUpActivity.this,
                            "비밀번호와 비밀번호 확인 password 가 다릅니다 !", Toast.LENGTH_SHORT);
                    myToast.show();
                }


            }

        });
    }
}


