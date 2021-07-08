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

public class Table3 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table3);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table3.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("3 x 1 = 3", R.raw.three_1za));
        Custom_Tables.add(new Custom_Tables("3 x 2 = 6", R.raw.three_2za));
        Custom_Tables.add(new Custom_Tables("3 x 3 = 9", R.raw.three_3za));
        Custom_Tables.add(new Custom_Tables("3 x 4 = 12", R.raw.three_4za));
        Custom_Tables.add(new Custom_Tables("3 x 5 = 15", R.raw.three_5za));
        Custom_Tables.add(new Custom_Tables("3 x 6 = 18", R.raw.three_6za));
        Custom_Tables.add(new Custom_Tables("3 x 7 = 21", R.raw.three_7za));
        Custom_Tables.add(new Custom_Tables("3 x 8 = 24", R.raw.three_8za));
        Custom_Tables.add(new Custom_Tables("3 x 9 = 27", R.raw.three_9za));
        Custom_Tables.add(new Custom_Tables("3 x 10 = 30", R.raw.three_10za));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table3.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}