package com.example.wairo.volo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VoloDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volo_detail);
            setContentView(R.layout.activity_main);
            // ウィジェットと結び付ける文
            Button btnNext=(Button) findViewById(R.id.sendButton);
            btnNext.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // スっ飛ばすインテントの生成
                    Intent intent=new Intent(VoloDetail.this,MainActivity.class);
                    // 実行
                    startActivity(intent);
                }
            });
        }
    }