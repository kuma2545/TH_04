package com.example.wairo.volo;

/**
 * Created by OGi on 2015/11/28.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class VoloListView01 extends Activity{
    ListView lv;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_volo_list_view01);

        String[] members = {
                "ボランディア団「ヘルパーズ」", "支援隊「オトモ」", "専修大学スパークマツナガ平和研究所",
                "Cephadrome's", "O.A.E救出支援隊　石巻支部", "ボランティア部「OGi's」", "ビリケン倶楽部",
                "蛹竹塾","いけめんツケめんズ", "えのき小学校ボランティア活動団", "モッチ02", "モブ",
                "Splasher's", "Double T", "ザ・べネファクター","TATARA", "杜王町自衛隊",
                "[データがありません]", "杜王町婦人会虹ヶ丘支部"
        };
        lv = (ListView) findViewById(R.id.voloListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, members);

        lv.setAdapter(adapter);

        //リスト項目がクリックされた時の処理
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), item + " clicked",
                        Toast.LENGTH_LONG).show();
            }
        });

        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //リスト項目が選択された時の処理
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(position);
            }

            //リスト項目がなにも選択されていない時の処理
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "no item selected",
                        Toast.LENGTH_LONG).show();
            }
        });

        //リスト項目が長押しされた時の処理
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), item + " を長押ししています",
                        Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
