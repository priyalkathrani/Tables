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

public class Table25 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table25);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table25.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table25.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("25 x 1 = 25", R.raw.twenty_five_1));
        Custom_Tables.add(new Custom_Tables("25 x 2 = 50", R.raw.twenty_five_2));
        Custom_Tables.add(new Custom_Tables("25 x 3 = 75", R.raw.twenty_five_3));
        Custom_Tables.add(new Custom_Tables("25 x 4 = 100", R.raw.twenty_five_4));
        Custom_Tables.add(new Custom_Tables("25 x 5 = 125", R.raw.twenty_five_5));
        Custom_Tables.add(new Custom_Tables("25 x 6 = 150", R.raw.twenty_five_6));
        Custom_Tables.add(new Custom_Tables("25 x 7 = 175", R.raw.twenty_five_7));
        Custom_Tables.add(new Custom_Tables("25 x 8 = 200", R.raw.twenty_five_8));
        Custom_Tables.add(new Custom_Tables("25 x 9 = 225", R.raw.twenty_five_9));
        Custom_Tables.add(new Custom_Tables("25 x 10 = 250", R.raw.twenty_five_10));

        yellow_Custom_Adapter adapter = new yellow_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table25.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}