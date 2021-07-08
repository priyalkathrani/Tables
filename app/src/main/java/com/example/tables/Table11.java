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

public class Table11 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table11);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table11.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table11.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("11 x 1 = 11", R.raw.eleven_1));
        Custom_Tables.add(new Custom_Tables("11 x 2 = 22", R.raw.eleven_2));
        Custom_Tables.add(new Custom_Tables("11 x 3 = 33", R.raw.eleven_3));
        Custom_Tables.add(new Custom_Tables("11 x 4 = 44", R.raw.eleven_4));
        Custom_Tables.add(new Custom_Tables("11 x 5 = 55", R.raw.eleven_5));
        Custom_Tables.add(new Custom_Tables("11 x 6 = 66", R.raw.eleven_6));
        Custom_Tables.add(new Custom_Tables("11 x 7 = 77", R.raw.eleven_7));
        Custom_Tables.add(new Custom_Tables("11 x 8 = 88", R.raw.eleven_8));
        Custom_Tables.add(new Custom_Tables("11 x 9 = 99", R.raw.eleven_9));
        Custom_Tables.add(new Custom_Tables("11 x 10 = 110", R.raw.eleven_10));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table11.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}