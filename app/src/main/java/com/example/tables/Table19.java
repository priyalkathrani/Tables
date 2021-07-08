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

public class Table19 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table19);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table19.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table19.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("19 x 1 = 19", R.raw.nineteen_1));
        Custom_Tables.add(new Custom_Tables("19 x 2 = 38", R.raw.nineteen_2));
        Custom_Tables.add(new Custom_Tables("19 x 3 = 57", R.raw.nineteen_3));
        Custom_Tables.add(new Custom_Tables("19 x 4 = 76", R.raw.nineteen_4));
        Custom_Tables.add(new Custom_Tables("19 x 5 = 95", R.raw.nineteen_5));
        Custom_Tables.add(new Custom_Tables("19 x 6 = 114", R.raw.nineteen_6));
        Custom_Tables.add(new Custom_Tables("19 x 7 = 133", R.raw.nineteen_7));
        Custom_Tables.add(new Custom_Tables("19 x 8 = 152", R.raw.nineteen_8));
        Custom_Tables.add(new Custom_Tables("19 x 9 = 171", R.raw.nineteen_9));
        Custom_Tables.add(new Custom_Tables("19 x 10 = 190", R.raw.nineteen_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table19.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}