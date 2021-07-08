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

public class Table5 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table5);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table5.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table5.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("5 x 1 = 5", R.raw.five_1za));
        Custom_Tables.add(new Custom_Tables("5 x 2 = 10", R.raw.five_2za));
        Custom_Tables.add(new Custom_Tables("5 x 3 = 15", R.raw.five_3za));
        Custom_Tables.add(new Custom_Tables("5 x 4 = 20", R.raw.five_4za));
        Custom_Tables.add(new Custom_Tables("5 x 5 = 25", R.raw.five_5za));
        Custom_Tables.add(new Custom_Tables("5 x 6 = 30", R.raw.five_6za));
        Custom_Tables.add(new Custom_Tables("5 x 7 = 35", R.raw.five_7za));
        Custom_Tables.add(new Custom_Tables("5 x 8 = 40", R.raw.five_8za));
        Custom_Tables.add(new Custom_Tables("5 x 9 = 45", R.raw.five_9za));
        Custom_Tables.add(new Custom_Tables("5 x 10 = 50", R.raw.five_10za));

        purple_Custom_Adapter adapter = new purple_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table5.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}