package com.example.myapplication;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BalanceGame extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_popup);
        Button del_btn=(Button)findViewById(R.id.del_btn);
        Button link_btn = (Button)findViewById(R.id.link_btn);
        TextView link = (TextView)findViewById(R.id.link_text);
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BalanceGame.this, MainActivity.class);
                startActivity(intent);
            }
        });

        link_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클립보드 사용 코드
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("game",link.getText()); //클립보드에 ID라는 이름표로 id 값을 복사하여 저장
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(BalanceGame.this, "링크가 복사되었습니다. 취향을 알고 싶은 상대에게 전송해보세요 !", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
