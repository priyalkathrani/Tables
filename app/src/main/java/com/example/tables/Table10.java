package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Table10 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table10);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table10.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table10.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("10 x 1 = 10", R.raw.ten_1za));
        Custom_Tables.add(new Custom_Tables("10 x 2 = 20", R.raw.ten_2za));
        Custom_Tables.add(new Custom_Tables("10 x 3 = 30", R.raw.ten_3za));
        Custom_Tables.add(new Custom_Tables("10 x 4 = 40", R.raw.ten_4za));
        Custom_Tables.add(new Custom_Tables("10 x 5 = 50", R.raw.ten_5za));
        Custom_Tables.add(new Custom_Tables("10 x 6 = 60", R.raw.ten_6za));
        Custom_Tables.add(new Custom_Tables("10 x 7 = 70", R.raw.ten_7za));
        Custom_Tables.add(new Custom_Tables("10 x 8 = 80", R.raw.ten_8za));
        Custom_Tables.add(new Custom_Tables("10 x 9 = 90", R.raw.ten_9za));
        Custom_Tables.add(new Custom_Tables("10 x 10 = 100", R.raw.ten_10za));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table10.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}