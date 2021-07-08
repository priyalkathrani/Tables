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

public class Table28 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table28);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table28.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table28.this, ExamPage.class);
                startActivity(intent);
            }
        });


        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("28 x 1 = 28", R.raw.twenty_eight_1));
        Custom_Tables.add(new Custom_Tables("28 x 2 = 56", R.raw.twenty_eight_2));
        Custom_Tables.add(new Custom_Tables("28 x 3 = 84", R.raw.twenty_eight_3));
        Custom_Tables.add(new Custom_Tables("28 x 4 = 112", R.raw.twenty_eight_4));
        Custom_Tables.add(new Custom_Tables("28 x 5 = 140", R.raw.twenty_eight_5));
        Custom_Tables.add(new Custom_Tables("28 x 6 = 168", R.raw.twenty_eight_6));
        Custom_Tables.add(new Custom_Tables("28 x 7 = 196", R.raw.twenty_eight_7));
        Custom_Tables.add(new Custom_Tables("28 x 8 = 224", R.raw.twenty_eight_8));
        Custom_Tables.add(new Custom_Tables("28 x 9 = 252", R.raw.twenty_eight_9));
        Custom_Tables.add(new Custom_Tables("28 x 10 = 280", R.raw.twenty_eight_10));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table28.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}