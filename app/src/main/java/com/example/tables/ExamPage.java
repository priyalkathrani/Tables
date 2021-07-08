package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ExamPage extends AppCompatActivity {

    Button t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page);

        ImageView backtohome = (ImageView) findViewById(R.id.backToHome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView backTablePage = (ImageView) findViewById(R.id.backTablePage);
        backTablePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExamPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        t1 = findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ExamPage.this, Table1.class);
                startActivity(i1);
            }
        });

        Button t2 = (Button) findViewById(R.id.t2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(ExamPage.this, Table2.class);
                startActivity(i2);
            }
        });

        Button t3 = (Button) findViewById(R.id.t3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(ExamPage.this, Table3.class);
                startActivity(i3);
            }
        });

        Button t4 = (Button) findViewById(R.id.t4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(ExamPage.this, Table4.class);
                startActivity(i4);
            }
        });

        Button t5 = (Button) findViewById(R.id.t5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(ExamPage.this, Table5.class);
                startActivity(i5);
            }
        });

        Button t6 = (Button) findViewById(R.id.t6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(ExamPage.this, Table6.class);
                startActivity(i6);
            }
        });

        Button t7 = (Button) findViewById(R.id.t7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(ExamPage.this, Table7.class);
                startActivity(i7);
            }
        });

        Button t8 = (Button) findViewById(R.id.t8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(ExamPage.this, Table8.class);
                startActivity(i8);
            }
        });

        Button t9 = (Button) findViewById(R.id.t9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(ExamPage.this, Table9.class);
                startActivity(i9);
            }
        });

        Button t10 = (Button) findViewById(R.id.t10);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(ExamPage.this, Table10.class);
                startActivity(i10);
            }
        });

        Button t11 = (Button) findViewById(R.id.t11);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(ExamPage.this, Table11.class);
                startActivity(i11);
            }
        });

        Button t12 = (Button) findViewById(R.id.t12);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(ExamPage.this, Table12.class);
                startActivity(i12);
            }
        });

        Button t13 = (Button) findViewById(R.id.t13);
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13 = new Intent(ExamPage.this, Table13.class);
                startActivity(i13);
            }
        });

        Button t14 = (Button) findViewById(R.id.t14);
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i14 = new Intent(ExamPage.this, Table14.class);
                startActivity(i14);
            }
        });

        Button t15 = (Button) findViewById(R.id.t15);
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15 = new Intent(ExamPage.this, Table15.class);
                startActivity(i15);
            }
        });

        Button t16 = (Button) findViewById(R.id.t16);
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(ExamPage.this, Table16.class);
                startActivity(i16);
            }
        });

        Button t17 = (Button) findViewById(R.id.t17);
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17 = new Intent(ExamPage.this, Table17.class);
                startActivity(i17);
            }
        });

        Button t18 = (Button) findViewById(R.id.t18);
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(ExamPage.this, Table18.class);
                startActivity(i18);
            }
        });

        Button t19 = (Button) findViewById(R.id.t19);
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i19 = new Intent(ExamPage.this, Table19.class);
                startActivity(i19);
            }
        });

        Button t20 = (Button) findViewById(R.id.t20);
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20= new Intent(ExamPage.this, Table20.class);
                startActivity(i20);
            }
        });

        Button t21 = (Button) findViewById(R.id.t21);
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(ExamPage.this, Table21.class);
                startActivity(i11);
            }
        });

        Button t22 = (Button) findViewById(R.id.t22);
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(ExamPage.this, Table22.class);
                startActivity(i12);
            }
        });

        Button t23 = (Button) findViewById(R.id.t23);
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13 = new Intent(ExamPage.this, Table23.class);
                startActivity(i13);
            }
        });

        Button t24 = (Button) findViewById(R.id.t24);
        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i14 = new Intent(ExamPage.this, Table24.class);
                startActivity(i14);
            }
        });

        Button t25 = (Button) findViewById(R.id.t25);
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15 = new Intent(ExamPage.this, Table25.class);
                startActivity(i15);
            }
        });

        Button t26 = (Button) findViewById(R.id.t26);
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(ExamPage.this, Table26.class);
                startActivity(i16);
            }
        });

        Button t27 = (Button) findViewById(R.id.t27);
        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i17 = new Intent(ExamPage.this, Table27.class);
                startActivity(i17);
            }
        });

        Button t28 = (Button) findViewById(R.id.t28);
        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i18 = new Intent(ExamPage.this, Table28.class);
                startActivity(i18);
            }
        });

        Button t29 = (Button) findViewById(R.id.t29);
        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i19 = new Intent(ExamPage.this, Table29.class);
                startActivity(i19);
            }
        });

        Button t30 = (Button) findViewById(R.id.t30);
        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i20= new Intent(ExamPage.this, Table30.class);
                startActivity(i20);
            }
        });
    }
}