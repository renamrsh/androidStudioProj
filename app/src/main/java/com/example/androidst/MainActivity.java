package com.example.androidst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView firsttext, secondtext, thirdtext;
    Button firstbutton, secondbutton, thirdbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firsttext = findViewById(R.id.firsttext);
        firstbutton = findViewById(R.id.firstbutton);
        firstbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firsttext.setText("Hello world");
            }
        });
        secondtext = findViewById(R.id.secondtext);
        secondbutton = findViewById(R.id.secondbutton);
        secondbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                secondtext.setText("Iryna Mariash");
            }
        });
        thirdtext = findViewById(R.id.thirdtext);
        thirdbutton = findViewById(R.id.thirdbutton);
        thirdbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                thirdtext.setText("Bye");
            }
        });

    }
}