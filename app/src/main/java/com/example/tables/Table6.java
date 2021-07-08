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

public class Table6 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table6);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table6.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Table6.this, ExamPage.class);
                startActivity(intent);
            }
        });

        final ArrayList<Custom_Tables> Custom_Tables = new ArrayList<Custom_Tables>();
        Custom_Tables.add(new Custom_Tables("6 x 1 = 6", R.raw.six_1za));
        Custom_Tables.add(new Custom_Tables("6 x 2 = 12", R.raw.six_2za));
        Custom_Tables.add(new Custom_Tables("6 x 3 = 18", R.raw.six_3za));
        Custom_Tables.add(new Custom_Tables("6 x 4 = 24", R.raw.six_4za));
        Custom_Tables.add(new Custom_Tables("6 x 5 = 30", R.raw.six_5za));
        Custom_Tables.add(new Custom_Tables("6 x 6 = 36", R.raw.six_6za));
        Custom_Tables.add(new Custom_Tables("6 x 7 = 42", R.raw.six_7za));
        Custom_Tables.add(new Custom_Tables("6 x 8 = 48", R.raw.six_8za));
        Custom_Tables.add(new Custom_Tables("6 x 9 = 54", R.raw.six_9za));
        Custom_Tables.add(new Custom_Tables("6 x 10 = 60", R.raw.six_10za));

        yellow_Custom_Adapter adapter = new yellow_Custom_Adapter(this, Custom_Tables);
        ListView listView = (ListView) findViewById(R.id.table_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Custom_Tables tables = Custom_Tables.get(position);
                mediaPlayer = MediaPlayer.create(Table6.this, tables.getMaudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}