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

public class Table23 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table23);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table23.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table23.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("23 x 1 = 23", R.raw.twenty_three_1));
        Custom_Tables.add(new Custom_Tables("23 x 2 = 46", R.raw.twenty_three_2));
        Custom_Tables.add(new Custom_Tables("23 x 3 = 69", R.raw.twenty_three_3));
        Custom_Tables.add(new Custom_Tables("23 x 4 = 92", R.raw.twenty_three_4));
        Custom_Tables.add(new Custom_Tables("23 x 5 = 115", R.raw.twenty_three_5));
        Custom_Tables.add(new Custom_Tables("23 x 6 = 138", R.raw.twenty_three_6));
        Custom_Tables.add(new Custom_Tables("23 x 7 = 161", R.raw.twenty_three_7));
        Custom_Tables.add(new Custom_Tables("23 x 8 = 184", R.raw.twenty_three_8));
        Custom_Tables.add(new Custom_Tables("23 x 9 = 207", R.raw.twenty_three_9));
        Custom_Tables.add(new Custom_Tables("23 x 10 = 230", R.raw.twenty_three_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table23.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}