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

public class Table17 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table17);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table17.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table17.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("17 x 1 = 17", R.raw.seventeen_1));
        Custom_Tables.add(new Custom_Tables("17 x 2 = 34", R.raw.seventeen_2));
        Custom_Tables.add(new Custom_Tables("17 x 3 = 51", R.raw.seventeen_3));
        Custom_Tables.add(new Custom_Tables("17 x 4 = 68", R.raw.seventeen_4));
        Custom_Tables.add(new Custom_Tables("17 x 5 = 85", R.raw.seventeen_5));
        Custom_Tables.add(new Custom_Tables("17 x 6 = 102", R.raw.seventeen_6));
        Custom_Tables.add(new Custom_Tables("17 x 7 = 119", R.raw.seventeen_7));
        Custom_Tables.add(new Custom_Tables("17 x 8 = 136", R.raw.seventeen_8));
        Custom_Tables.add(new Custom_Tables("17 x 9 = 153", R.raw.seventeen_9));
        Custom_Tables.add(new Custom_Tables("17 x 10 = 170", R.raw.seventeen_10));

        purple_Custom_Adapter adapter = new purple_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table17.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}