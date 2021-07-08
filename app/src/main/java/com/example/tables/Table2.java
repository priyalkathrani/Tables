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

public class Table2 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table2.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("2 x 1 = 2", R.raw.two_1za));
        Custom_Tables.add(new Custom_Tables("2 x 2 = 4", R.raw.two_2za));
        Custom_Tables.add(new Custom_Tables("2 x 3 = 6", R.raw.two_3za));
        Custom_Tables.add(new Custom_Tables("2 x 4 = 8", R.raw.two_4za));
        Custom_Tables.add(new Custom_Tables("2 x 5 = 10", R.raw.two_5za));
        Custom_Tables.add(new Custom_Tables("2 x 6 = 12", R.raw.two_6za));
        Custom_Tables.add(new Custom_Tables("2 x 7 = 14", R.raw.two_7za));
        Custom_Tables.add(new Custom_Tables("2 x 8 = 16", R.raw.two_8za));
        Custom_Tables.add(new Custom_Tables("2 x 9 = 18", R.raw.two_9za));
        Custom_Tables.add(new Custom_Tables("2 x 10 = 20", R.raw.two_10za));

        yellow_Custom_Adapter adapter = new yellow_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table2.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}