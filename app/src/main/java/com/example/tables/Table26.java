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

public class Table26 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table26);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table26.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table26.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("26 x 1 = 26", R.raw.twenty_six_1));
        Custom_Tables.add(new Custom_Tables("26 x 2 = 52", R.raw.twenty_six_2));
        Custom_Tables.add(new Custom_Tables("26 x 3 = 78", R.raw.twenty_six_3));
        Custom_Tables.add(new Custom_Tables("26 x 4 = 104", R.raw.twenty_six_4));
        Custom_Tables.add(new Custom_Tables("26 x 5 = 130", R.raw.twenty_six_5));
        Custom_Tables.add(new Custom_Tables("26 x 6 = 156", R.raw.twenty_six_6));
        Custom_Tables.add(new Custom_Tables("26 x 7 = 182", R.raw.twenty_six_7));
        Custom_Tables.add(new Custom_Tables("26 x 8 = 208", R.raw.twenty_six_8));
        Custom_Tables.add(new Custom_Tables("26 x 9 = 234", R.raw.twenty_six_9));
        Custom_Tables.add(new Custom_Tables("26 x 10 = 260", R.raw.twenty_six_10));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table26.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}