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

public class Table12 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table12);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table12.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table12.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("12 x 1 = 12", R.raw.twelve_1));
        Custom_Tables.add(new Custom_Tables("12 x 2 = 24", R.raw.twelve_2));
        Custom_Tables.add(new Custom_Tables("12 x 3 = 36", R.raw.twelve_3));
        Custom_Tables.add(new Custom_Tables("12 x 4 = 48", R.raw.twelve_4));
        Custom_Tables.add(new Custom_Tables("12 x 5 = 60", R.raw.twelve_5));
        Custom_Tables.add(new Custom_Tables("12 x 6 = 72", R.raw.twelve_6));
        Custom_Tables.add(new Custom_Tables("12 x 7 = 84", R.raw.twelve_7));
        Custom_Tables.add(new Custom_Tables("12 x 8 = 96", R.raw.twelve_8));
        Custom_Tables.add(new Custom_Tables("12 x 9 = 108", R.raw.twelve_9));
        Custom_Tables.add(new Custom_Tables("12 x 10 = 120", R.raw.twelve_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table12.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}