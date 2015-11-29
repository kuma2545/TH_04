package com.example.wairo.volo;

/**
 * Created by OGi on 2015/11/28.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView lv;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_volo_list_view01);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        adapter.add("Apple");
        adapter.add("orange");
        adapter.add("strawberry");
        adapter.add("volunteer");
        adapter.add("walker");
        adapter.add("tree");
        adapter.add("aaaa");
        adapter.add("bbbb");
        adapter.add("hello");

        ListView lv = (ListView) findViewById(R.id.voloListView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, VoloDetail.class);
                startActivity(intent);

            }


        });

    }

}
