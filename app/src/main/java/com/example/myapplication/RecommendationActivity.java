package com.example.myapplication;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class RecommendationActivity extends AppCompatActivity {
    private static final String TAG = "RecommendationActivity";
    private FirebaseFirestore db;
    private TextView priceTextView;
    private TextView ageTextView;
    private TextView mbtiTextView;
    private TextView genderTextView;
    private TextView nameTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recomendation);

        // Firebase Firestore 인스턴스 초기화
        db = FirebaseFirestore.getInstance();

        // XML 레이아웃과 TextView 연결
        priceTextView = findViewById(R.id.priceTextView);
        ageTextView = findViewById(R.id.ageTextView);
        mbtiTextView = findViewById(R.id.mbtiTextView);
        genderTextView = findViewById(R.id.genderTextView);
        nameTextView = findViewById(R.id.nameTextView);

        // Firestore에서 데이터 가져오기
        getProductData();
    }

    private void getProductData() {
        db.collection("product").document("MLB 볼캡") // 여기에 실제 문서 ID를 입력하세요.
                .get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if (documentSnapshot.exists()) {
                            // Firestore에서 필드값 가져오기
                            String price = documentSnapshot.getString("가격");
                            String age = documentSnapshot.getString("추천 나이");
                            String mbti = documentSnapshot.getString("추천 MBTI");
                            String gender = documentSnapshot.getString("추천 성별");
                            String name = documentSnapshot.getString("상품명");

                            // TextView에 데이터 설정
                            nameTextView.setText(name);
                            priceTextView.setText(price);
                            ageTextView.setText(age);
                            mbtiTextView.setText(mbti);
                            genderTextView.setText(gender);
                        } else {
                            Log.d(TAG, "No such document");
                        }
                    }
                });
    }
}
