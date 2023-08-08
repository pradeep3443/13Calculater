 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

EditText metNum2;
TextView mResult;

Button mCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metNum2 = (EditText)findViewById(R.id.etAmt2);
        mResult = (TextView) findViewById(R.id.result);
        mCalculate =(Button) findViewById(R.id.calculate);
        onTax();

    }

     private void onTax() {
        mCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amt = Double.parseDouble(metNum2.getText().toString());
                double result = (amt * 0.13) + amt;
                mResult.setText(Double.toString(result));


            }
        });
     }
 }