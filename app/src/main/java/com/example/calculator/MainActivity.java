package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button plus, minus, mul, dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.numberOneId);
        num2 = (EditText)findViewById(R.id.numberTwoId);
        result = (TextView)findViewById(R.id.resultId);

        plus = (Button) findViewById(R.id.buttonPlusId);
        minus = (Button)findViewById(R.id.buttonMinusId);
        mul = (Button)findViewById(R.id.buttonMulId);
        dev = (Button)findViewById(R.id.buttonDevId);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int res = n1+n2;
                result.setText(""+res);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int res = n1-n2;
                result.setText(""+res);

            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                double r1 = Double.parseDouble(number1);
                double r2 = Double.parseDouble(number2);
                double res = r1/r2;
                result.setText(""+res);



            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int res = n1*n2;
                result.setText(""+res);

            }
        });


    }
}