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

public class Table4 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table4);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table4.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table4.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("4 x 1 = 4", R.raw.four_1za));
        Custom_Tables.add(new Custom_Tables("4 x 2 = 8", R.raw.four_2za));
        Custom_Tables.add(new Custom_Tables("4 x 3 = 12", R.raw.four_3za));
        Custom_Tables.add(new Custom_Tables("4 x 4 = 16", R.raw.four_4za));
        Custom_Tables.add(new Custom_Tables("4 x 5 = 20", R.raw.four_5za));
        Custom_Tables.add(new Custom_Tables("4 x 6 = 24", R.raw.four_6za));
        Custom_Tables.add(new Custom_Tables("4 x 7 = 28", R.raw.four_7za));
        Custom_Tables.add(new Custom_Tables("4 x 8 = 32", R.raw.four_8za));
        Custom_Tables.add(new Custom_Tables("4 x 9 = 36", R.raw.four_9za));
        Custom_Tables.add(new Custom_Tables("4 x 10 = 40", R.raw.four_10za));

        pink_Custom_Adapter adapter = new pink_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table4.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}