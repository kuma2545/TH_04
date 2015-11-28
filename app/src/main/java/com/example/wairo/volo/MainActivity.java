package com.example.wairo.volo;
//最終確認画面
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ウィジェットと結び付ける文
        Button btnNext=(Button) findViewById(R.id.sendButton);
        btnNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                       "送信に成功しました", Toast.LENGTH_LONG).show();
                // スっ飛ばすインテントの生成
                Intent intent=new Intent(MainActivity.this,VoloListView01.class);//送信先（VoloListView01）
                // 実行
                startActivity(intent);
            }
        });
    }
}
