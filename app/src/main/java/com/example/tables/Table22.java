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

public class Table22 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table22);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table22.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table22.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("22 x 1 = 22", R.raw.twenty_two_1));
        Custom_Tables.add(new Custom_Tables("22 x 2 = 44", R.raw.twenty_two_2));
        Custom_Tables.add(new Custom_Tables("22 x 3 = 66", R.raw.twenty_two_3));
        Custom_Tables.add(new Custom_Tables("22 x 4 = 88", R.raw.twenty_two_4));
        Custom_Tables.add(new Custom_Tables("22 x 5 = 110", R.raw.twenty_two_5));
        Custom_Tables.add(new Custom_Tables("22 x 6 = 132", R.raw.twenty_two_6));
        Custom_Tables.add(new Custom_Tables("22 x 7 = 164", R.raw.twenty_two_7));
        Custom_Tables.add(new Custom_Tables("22 x 8 = 186", R.raw.twenty_two_8));
        Custom_Tables.add(new Custom_Tables("22 x 9 = 208", R.raw.twenty_two_9));
        Custom_Tables.add(new Custom_Tables("22 x 10 = 220", R.raw.twenty_two_10));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table22.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}