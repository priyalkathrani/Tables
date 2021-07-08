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

public class Table8 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table8);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table8.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table8.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("8 x 1 = 8", R.raw.eight_1za));
        Custom_Tables.add(new Custom_Tables("8 x 2 = 16", R.raw.eight_2za));
        Custom_Tables.add(new Custom_Tables("8 x 3 = 24", R.raw.eight_3za));
        Custom_Tables.add(new Custom_Tables("8 x 4 = 32", R.raw.eight_4za));
        Custom_Tables.add(new Custom_Tables("8 x 5 = 40", R.raw.eight_5za));
        Custom_Tables.add(new Custom_Tables("8 x 6 = 48", R.raw.eight_6za));
        Custom_Tables.add(new Custom_Tables("8 x 7 = 56", R.raw.eight_7za));
        Custom_Tables.add(new Custom_Tables("8 x 8 = 64", R.raw.eight_8za));
        Custom_Tables.add(new Custom_Tables("8 x 9 = 72", R.raw.eight_9za));
        Custom_Tables.add(new Custom_Tables("8 x 10 = 80", R.raw.eight_10za));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table8.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}