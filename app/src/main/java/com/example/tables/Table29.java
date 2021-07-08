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

public class Table29 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table29);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table29.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table29.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("29 x 1 = 29", R.raw.twenty_nine_1));
        Custom_Tables.add(new Custom_Tables("29 x 2 = 58", R.raw.twenty_nine_2));
        Custom_Tables.add(new Custom_Tables("29 x 3 = 87", R.raw.twenty_nine_3));
        Custom_Tables.add(new Custom_Tables("29 x 4 = 116", R.raw.twenty_nine_4));
        Custom_Tables.add(new Custom_Tables("29 x 5 = 145", R.raw.twenty_nine_5));
        Custom_Tables.add(new Custom_Tables("29 x 6 = 174", R.raw.twenty_nine_6));
        Custom_Tables.add(new Custom_Tables("29 x 7 = 203", R.raw.twenty_nine_7));
        Custom_Tables.add(new Custom_Tables("29 x 8 = 232", R.raw.twenty_nine_8));
        Custom_Tables.add(new Custom_Tables("29 x 9 = 261", R.raw.twenty_nine_9));
        Custom_Tables.add(new Custom_Tables("29 x 10 = 290", R.raw.twenty_nine_10));

        yellow_Custom_Adapter adapter = new yellow_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table29.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}