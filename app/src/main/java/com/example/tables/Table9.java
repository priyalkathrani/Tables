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

public class Table9 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table9);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table9.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table9.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("9 x 1 = 9", R.raw.nine_1za));
        Custom_Tables.add(new Custom_Tables("9 x 2 = 18", R.raw.nine_2za));
        Custom_Tables.add(new Custom_Tables("9 x 3 = 27", R.raw.nine_3za));
        Custom_Tables.add(new Custom_Tables("9 x 4 = 36", R.raw.nine_4za));
        Custom_Tables.add(new Custom_Tables("9 x 5 = 45", R.raw.nine_5za));
        Custom_Tables.add(new Custom_Tables("9 x 6 = 54", R.raw.nine_6za));
        Custom_Tables.add(new Custom_Tables("9 x 7 = 63", R.raw.nine_7za));
        Custom_Tables.add(new Custom_Tables("9 x 8 = 72", R.raw.nine_8za));
        Custom_Tables.add(new Custom_Tables("9 x 9 = 81", R.raw.nine_9za));
        Custom_Tables.add(new Custom_Tables("9 x 10 = 90", R.raw.nine_10za));

        purple_Custom_Adapter adapter = new purple_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table9.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}