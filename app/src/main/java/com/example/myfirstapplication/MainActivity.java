package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;
    String workings = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        workingsTV=(TextView)findViewById(R.id.workingsTextView);
        resultsTV=(TextView)findViewById(R.id.resultTextView);
    }

    public void setWorkings(String givenValue){
        workings = workings + givenValue;
        workingsTV.setText(workings);
    }

    public void clearOnClick(View view) {
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
    }

    public void equalOnClick(View view) {

    }

    public void divisionOnClick(View view) {
        setWorkings("/");
    }

    public void zeroOnClick(View view) {
        setWorkings("0");
    }

    public void multiplicationOnClick(View view) {
        setWorkings("*");
    }

    public void minusOnClick(View view) {
        setWorkings("-");
    }

    public void threeOnClick(View view) {
        setWorkings("3");
    }

    public void twoOnClick(View view) {
        setWorkings("2");
    }

    public void oneOnClick(View view) {
        setWorkings("1");
    }

    public void plusOnClick(View view) {
        setWorkings("+");
    }

    public void sixOnClick(View view) {
        setWorkings("6");
    }

    public void fiveOnClick(View view) {
        setWorkings("5");
    }

    public void fourthOnClick(View view) {
        setWorkings("4");
    }

    public void nineOnClick(View view) {
        setWorkings("9");
    }

    public void eightOnClick(View view) {
        setWorkings("8");
    }

    public void sevenOnClick(View view) {
        setWorkings("7");
    }


//    TextView firsttext, secondtext, thirdtext;
//    Button firstbutton, secondbutton, thirdbutton;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        firsttext = findViewById(R.id.firsttext);
//        firstbutton = findViewById(R.id.firstbutton);
//        firstbutton.setOnClickListener(new View.OnClickListener(){
//           @Override
//           public void onClick(View view){
//               firsttext.setText("Hello world");
//           }
//        });
//        secondtext = findViewById(R.id.secondtext);
//        secondbutton = findViewById(R.id.secondbutton);
//        secondbutton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                secondtext.setText("Iryna Mariash");
//            }
//        });
//        thirdtext = findViewById(R.id.thirdtext);
//        thirdbutton = findViewById(R.id.thirdbutton);
//        thirdbutton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                thirdtext.setText("Bye");
//            }
//        });
//
//    }
}