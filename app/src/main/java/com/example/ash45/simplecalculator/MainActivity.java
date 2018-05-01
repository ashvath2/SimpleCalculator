package com.example.ash45.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bPlus, bMinus, bMultiply, bDivide, bEqual, bC;
    TextView solution;
    double num1, num2;

    boolean a, s, m, d;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bPlus = (Button) findViewById(R.id.bPlus);
        bMinus = (Button) findViewById(R.id.bMinus);
        bMultiply = (Button) findViewById(R.id.bMultiply);
        bDivide = (Button) findViewById(R.id.bDivide);
        bEqual = (Button) findViewById(R.id.bEqual);
        bC = (Button) findViewById(R.id.bC);



        solution = (TextView) findViewById(R.id.solution);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setText(solution.getText() + "0");
            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(solution.getText() + "");
                a = true;
                solution.setText(null);
            }
        });
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(solution.getText() + "");
                s = true;
                solution.setText(null);
            }
        });
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(solution.getText() + "");
                m = true;
                solution.setText(null);
            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(solution.getText() + "");
                d = true;
                solution.setText(null);
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(solution.getText() + "");

                if (a == true) {


                    solution.setText(num1 + num2 + "");
                    a = false;
                }

                if (s == true) {
                    solution.setText((num1 - num2) + "");
                    s = false;
                }

                if (m == true) {
                    solution.setText(num1 * num2 + "");
                    m = false;
                }

                if (d == true) {
                    solution.setText(num1 / num2 + "");
                    d = false;
                }
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                a = false;
                s = false;
                d = false;
                m = false;
                solution.setText("");
            }
        });













    }
}