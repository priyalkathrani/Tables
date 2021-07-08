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

public class Table27 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table27);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table27.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table27.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("27 x 1 = 27", R.raw.twenty_seven_1));
        Custom_Tables.add(new Custom_Tables("27 x 2 = 54", R.raw.twenty_seven_2));
        Custom_Tables.add(new Custom_Tables("27 x 3 = 81", R.raw.twenty_seven_3));
        Custom_Tables.add(new Custom_Tables("27 x 4 = 108", R.raw.twenty_seven_4));
        Custom_Tables.add(new Custom_Tables("27 x 5 = 135", R.raw.twenty_seven_5));
        Custom_Tables.add(new Custom_Tables("27 x 6 = 162", R.raw.twenty_seven_6));
        Custom_Tables.add(new Custom_Tables("27 x 7 = 189", R.raw.twenty_seven_7));
        Custom_Tables.add(new Custom_Tables("27 x 8 = 216", R.raw.twenty_seven_8));
        Custom_Tables.add(new Custom_Tables("27 x 9 = 243", R.raw.twenty_seven_9));
        Custom_Tables.add(new Custom_Tables("27 x 10 = 270", R.raw.twenty_seven_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table27.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}