package com.example.tables;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quizPage extends AppCompatActivity {

    Random random = new Random();
    int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button b = (Button) findViewById(R.id.check_answer);
        TextView first_number_view = (TextView) findViewById(R.id.first_number);
        TextView second_number_view = (TextView) findViewById(R.id.second_number);
        EditText your_answer = (EditText) findViewById(R.id.answer);
        TextView result_view = (TextView) findViewById(R.id.result);


        String first_number = String.valueOf(random.nextInt(30));
        String second_number = String.valueOf(random.nextInt(10));
        String correct_answer = String.valueOf(Integer.parseInt(first_number) * Integer.parseInt(second_number));

        first_number_view.setText(first_number);
        second_number_view.setText(second_number);


        if (correct_answer == String.valueOf(your_answer)) {
            int True=0;
            True++;
            result_view.setText(String.valueOf(True));
        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j++;
                if(j<=10)
                {
                    Intent i = new Intent(quizPage.this, quizPage.class);
                    startActivity(i);
                }

            }
        });
    }
}