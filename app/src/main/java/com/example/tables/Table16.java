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

public class Table16 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table16);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table16.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table16.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("16 x 1 = 16", R.raw.sixteen_1));
        Custom_Tables.add(new Custom_Tables("16 x 2 = 32", R.raw.sixteen_2));
        Custom_Tables.add(new Custom_Tables("16 x 3 = 48", R.raw.sixteen_3));
        Custom_Tables.add(new Custom_Tables("16 x 4 = 64", R.raw.sixteen_4));
        Custom_Tables.add(new Custom_Tables("16 x 5 = 80", R.raw.sixteen_5));
        Custom_Tables.add(new Custom_Tables("16 x 6 = 96", R.raw.sixteen_6));
        Custom_Tables.add(new Custom_Tables("16 x 7 = 112", R.raw.sixteen_7));
        Custom_Tables.add(new Custom_Tables("16 x 8 = 128", R.raw.sixteen_8));
        Custom_Tables.add(new Custom_Tables("16 x 9 = 144", R.raw.sixteen_9));
        Custom_Tables.add(new Custom_Tables("16 x 10 = 160", R.raw.sixteen_10));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table16.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}