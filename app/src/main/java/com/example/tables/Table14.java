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

public class Table14 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table14);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table14.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table14.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("14 x 1 = 14", R.raw.fourteen_1));
        Custom_Tables.add(new Custom_Tables("14 x 2 = 28", R.raw.fourteen_2));
        Custom_Tables.add(new Custom_Tables("14 x 3 = 42", R.raw.fourteen_3));
        Custom_Tables.add(new Custom_Tables("14 x 4 = 56", R.raw.fourteen_4));
        Custom_Tables.add(new Custom_Tables("14 x 5 = 70", R.raw.fourteen_5));
        Custom_Tables.add(new Custom_Tables("14 x 6 = 84", R.raw.fourteen_6));
        Custom_Tables.add(new Custom_Tables("14 x 7 = 98", R.raw.fourteen_7));
        Custom_Tables.add(new Custom_Tables("14 x 8 = 112", R.raw.fourteen_8));
        Custom_Tables.add(new Custom_Tables("14 x 9 = 126", R.raw.fourteen_9));
        Custom_Tables.add(new Custom_Tables("14 x 10 = 140", R.raw.fourteen_10));



        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table14.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}