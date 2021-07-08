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

public class Table21 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table21);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table21.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table21.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("21 x 1 = 21", R.raw.twenty_one_1));
        Custom_Tables.add(new Custom_Tables("21 x 2 = 42", R.raw.twenty_one_2));
        Custom_Tables.add(new Custom_Tables("21 x 3 = 63", R.raw.twenty_one_3));
        Custom_Tables.add(new Custom_Tables("21 x 4 = 84", R.raw.twenty_one_4));
        Custom_Tables.add(new Custom_Tables("21 x 5 = 105", R.raw.twenty_one_5));
        Custom_Tables.add(new Custom_Tables("21 x 6 = 126", R.raw.twenty_one_6));
        Custom_Tables.add(new Custom_Tables("21 x 7 = 147", R.raw.twenty_one_7));
        Custom_Tables.add(new Custom_Tables("21 x 8 = 168", R.raw.twenty_one_8));
        Custom_Tables.add(new Custom_Tables("21 x 9 = 189", R.raw.twenty_one_9));
        Custom_Tables.add(new Custom_Tables("21 x 10 = 210", R.raw.twenty_one_10));

        purple_Custom_Adapter adapter = new purple_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table21.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}