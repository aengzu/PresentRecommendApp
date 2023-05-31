package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;



/** 사용자 계정 정보 모델 클래스
 * */

public class UserAccount extends AppCompatActivity {


    private String emailId; //  이메일 아이디
    private String IdToken; // Firebase Uid(고유 토큰 정보)
    private String password;
    private String name;
    private String MBTI;
    private int age;

    public UserAccount() {}

    public String getIdToken() { return IdToken;}
    public void setIdToken(String idToken) { this.IdToken = idToken;}

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String EmailId){
        this.emailId = EmailId;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
