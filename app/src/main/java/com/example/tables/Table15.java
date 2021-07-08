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

public class Table15 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table15);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table15.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table15.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("15 x 1 = 15", R.raw.fifteen_1));
        Custom_Tables.add(new Custom_Tables("15 x 2 = 30", R.raw.fifteen_2));
        Custom_Tables.add(new Custom_Tables("15 x 3 = 45", R.raw.fifteen_3));
        Custom_Tables.add(new Custom_Tables("15 x 4 = 60", R.raw.fifteen_4));
        Custom_Tables.add(new Custom_Tables("15 x 5 = 75", R.raw.fifteen_5));
        Custom_Tables.add(new Custom_Tables("15 x 6 = 90", R.raw.fifteen_6));
        Custom_Tables.add(new Custom_Tables("15 x 7 = 105", R.raw.fifteen_7));
        Custom_Tables.add(new Custom_Tables("15 x 8 = 120", R.raw.fifteen_8));
        Custom_Tables.add(new Custom_Tables("15 x 9 = 135", R.raw.fifteen_9));
        Custom_Tables.add(new Custom_Tables("15 x 10 = 150", R.raw.fifteen_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table15.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}