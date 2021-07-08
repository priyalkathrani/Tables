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

public class Table1 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table1.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("1 x 1 = 1", R.raw.one_1za));
        Custom_Tables.add(new Custom_Tables("1 x 2 = 2", R.raw.one_2za));
        Custom_Tables.add(new Custom_Tables("1 x 3 = 3", R.raw.one_3za));
        Custom_Tables.add(new Custom_Tables("1 x 4 = 4", R.raw.one_4za));
        Custom_Tables.add(new Custom_Tables("1 x 5 = 5", R.raw.one_5za));
        Custom_Tables.add(new Custom_Tables("1 x 6 = 6", R.raw.one_6za));
        Custom_Tables.add(new Custom_Tables("1 x 7 = 7", R.raw.one_7za));
        Custom_Tables.add(new Custom_Tables("1 x 8 = 8", R.raw.one_8za));
        Custom_Tables.add(new Custom_Tables("1 x 9 = 9", R.raw.one_9za));
        Custom_Tables.add(new Custom_Tables("1 x 10 = 10", R.raw.one_10za));

        teal_Custom_Adapter adapter = new teal_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table1.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}