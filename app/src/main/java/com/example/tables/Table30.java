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

public class Table30 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table30);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table30.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table30.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("30 x 1 = 30", R.raw.thirty_1));
        Custom_Tables.add(new Custom_Tables("30 x 2 = 60", R.raw.thirty_2));
        Custom_Tables.add(new Custom_Tables("30 x 3 = 90", R.raw.thirty_3));
        Custom_Tables.add(new Custom_Tables("30 x 4 = 120", R.raw.thirty_4));
        Custom_Tables.add(new Custom_Tables("30 x 5 = 150", R.raw.thirty_5));
        Custom_Tables.add(new Custom_Tables("30 x 6 = 180", R.raw.thirty_6));
        Custom_Tables.add(new Custom_Tables("30 x 7 = 210", R.raw.thirty_7));
        Custom_Tables.add(new Custom_Tables("30 x 8 = 240", R.raw.thirty_8));
        Custom_Tables.add(new Custom_Tables("30 x 9 = 270", R.raw.thirty_9));
        Custom_Tables.add(new Custom_Tables("30 x 10 = 300", R.raw.thirty_10));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table30.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}