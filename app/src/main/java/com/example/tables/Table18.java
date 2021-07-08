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

public class Table18 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table18);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table18.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table18.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("18 x 1 = 18", R.raw.eighteen_1));
        Custom_Tables.add(new Custom_Tables("18 x 2 = 36", R.raw.eighteen_2));
        Custom_Tables.add(new Custom_Tables("18 x 3 = 54", R.raw.eighteen_3));
        Custom_Tables.add(new Custom_Tables("18 x 4 = 72", R.raw.eighteen_4));
        Custom_Tables.add(new Custom_Tables("18 x 5 = 90", R.raw.eighteen_5));
        Custom_Tables.add(new Custom_Tables("18 x 6 = 108", R.raw.eighteen_6));
        Custom_Tables.add(new Custom_Tables("18 x 7 = 126", R.raw.eighteen_7));
        Custom_Tables.add(new Custom_Tables("18 x 8 = 144", R.raw.eighteen_8));
        Custom_Tables.add(new Custom_Tables("18 x 9 = 162", R.raw.eighteen_9));
        Custom_Tables.add(new Custom_Tables("18 x 10 = 180", R.raw.eighteen_10));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table18.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}