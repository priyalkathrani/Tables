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

public class Table7 extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table7);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table7.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table7.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("7 x 1 = 7", R.raw.seven_1za));
        Custom_Tables.add(new Custom_Tables("7 x 2 = 14", R.raw.seven_2za));
        Custom_Tables.add(new Custom_Tables("7 x 3 = 21", R.raw.seven_3za));
        Custom_Tables.add(new Custom_Tables("7 x 4 = 28", R.raw.seven_4za));
        Custom_Tables.add(new Custom_Tables("7 x 5 = 35", R.raw.seven_5za));
        Custom_Tables.add(new Custom_Tables("7 x 6 = 42", R.raw.seven_6za));
        Custom_Tables.add(new Custom_Tables("7 x 7 = 49", R.raw.seven_7za));
        Custom_Tables.add(new Custom_Tables("7 x 8 = 56", R.raw.seven_8za));
        Custom_Tables.add(new Custom_Tables("7 x 9 = 63", R.raw.seven_9za));
        Custom_Tables.add(new Custom_Tables("7 x 10 = 70", R.raw.seven_10za));

        green_Custom_Adapter adapter = new green_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table7.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}