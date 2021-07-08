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

public class Table20 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table20);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table20.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table20.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("20 x 1 = 20", R.raw.twenty_1));
        Custom_Tables.add(new Custom_Tables("20 x 2 = 40", R.raw.twenty_2));
        Custom_Tables.add(new Custom_Tables("20 x 3 = 60", R.raw.twenty_3));
        Custom_Tables.add(new Custom_Tables("20 x 4 = 80", R.raw.twenty_4));
        Custom_Tables.add(new Custom_Tables("20 x 5 = 100", R.raw.twenty_5));
        Custom_Tables.add(new Custom_Tables("20 x 6 = 120", R.raw.twenty_6));
        Custom_Tables.add(new Custom_Tables("20 x 7 = 140", R.raw.twenty_7));
        Custom_Tables.add(new Custom_Tables("20 x 8 = 160", R.raw.twenty_8));
        Custom_Tables.add(new Custom_Tables("20 x 9 = 180", R.raw.twenty_9));
        Custom_Tables.add(new Custom_Tables("20 x 10 = 200", R.raw.twenty_10));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table20.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}