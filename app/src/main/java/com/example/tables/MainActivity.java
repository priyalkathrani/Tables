package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button exambtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exambtn = findViewById(R.id.exambtn);
        exambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExamPage.class);
                startActivity(intent);
            }
        });

        ImageView rat = (ImageView) findViewById(R.id.rat);
        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.ilyas.ilyasapps.mathtablespro");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(i);

            }
        });

        ImageView share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.ilyas.ilyasapps.mathtablespro");
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.ilyas.ilyasapps.mathtablespro");
                i.setType("text/plain");
                startActivity(Intent.createChooser(i,"share via"));
            }
        });
    }
}