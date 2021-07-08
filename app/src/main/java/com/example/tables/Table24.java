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

public class Table24 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table24);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table24.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table24.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("24 x 1 = 24", R.raw.twenty_four_1));
        Custom_Tables.add(new Custom_Tables("24 x 2 = 48", R.raw.twenty_four_2));
        Custom_Tables.add(new Custom_Tables("24 x 3 = 72", R.raw.twenty_four_3));
        Custom_Tables.add(new Custom_Tables("24 x 4 = 96", R.raw.twenty_four_4));
        Custom_Tables.add(new Custom_Tables("24 x 5 = 120", R.raw.twenty_four_5));
        Custom_Tables.add(new Custom_Tables("24 x 6 = 144", R.raw.twenty_four_6));
        Custom_Tables.add(new Custom_Tables("24 x 7 = 168", R.raw.twenty_four_7));
        Custom_Tables.add(new Custom_Tables("24 x 8 = 192", R.raw.twenty_four_8));
        Custom_Tables.add(new Custom_Tables("24 x 9 = 216", R.raw.twenty_four_9));
        Custom_Tables.add(new Custom_Tables("24 x 10 = 240", R.raw.twenty_four_10));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table24.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}