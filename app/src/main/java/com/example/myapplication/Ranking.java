package com.example.myapplication;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Ranking {
    private static FirebaseFirestore db = FirebaseFirestore.getInstance();

    //CollectionReference 는 파이어스토어의 컬렉션을 참조하는 객체다.
    CollectionReference productRef = db.collection("product");
    //get()을 통해서 해당 컬렉션의 정보를 가져온다.
            productRef.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
        @Override
        public void onComplete Object QuerySnapshot;
        (@NonNull Task<QuerySnapshot> task) {
            //작업이 성공적으로 마쳤을때
            if (task.isSuccessful()) {
                //컬렉션 아래에 있는 모든 정보를 가져온다.
                for (QueryDocumentSnapshot document : task.getResult()) {
                    //document.getData() or document.getId() 등등 여러 방법으로
                    //데이터를 가져올 수 있다.
                }
                //그렇지 않을때
            } else {

            }
        }
    });
}
