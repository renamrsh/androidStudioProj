package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;
    String workings = "";
    boolean lastInputIsOperator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        workingsTV = findViewById(R.id.workingsTextView);
        resultsTV = findViewById(R.id.resultTextView);
    }

    public void setWorkings(String givenValue) {
        if (isOperator(givenValue) && lastInputIsOperator) {
            return; // Do not add operator if the last input was an operator
        }

        workings = workings + givenValue;
        workingsTV.setText(workings);

        lastInputIsOperator = isOperator(givenValue);
    }

    private boolean isOperator(String value) {
        return value.equals("/") || value.equals("*") || value.equals("-") || value.equals("+");
    }

    public void clearOnClick(View view) {
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
        lastInputIsOperator = false;
    }

    public void equalOnClick(View view) {
        try {
            String result = evaluateExpression(workings);
            resultsTV.setText(result);
        } catch (ScriptException e) {
            resultsTV.setText("Error");
        }
    }

    private String evaluateExpression(String expression) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        Object result = engine.eval(expression);

        if (result instanceof Double) {
            double doubleResult = (Double) result;
            if (doubleResult == (int) doubleResult) {
                return String.valueOf((int) doubleResult);
            } else {
                return String.format("%.2f", doubleResult);
            }
        } else {
            return result.toString();
        }
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

}