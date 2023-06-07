package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;



/** 사용자 계정 정보 모델 클래스
 * */

public class UserAccount {

    public UserAccount() {

    }
    String uid;
    String email;
    String name;
    String gender;
    String MBTI;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMBTI() {
        return MBTI;
    }

    public void setMBTI(String MBTI) {
        this.MBTI = MBTI;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    String age;



    public UserAccount(String email, String name, String age, String gender, String MBTI) {
        this.email = email;
        this.name = name;
        this.age  = age;
        this.gender = gender;
        this.MBTI = MBTI;
    }



}