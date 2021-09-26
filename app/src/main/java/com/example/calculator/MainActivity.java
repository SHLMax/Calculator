package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionAdd(View view) {
        EditText text1 = (EditText) findViewById(R.id.Number1);
        EditText text2 = (EditText) findViewById(R.id.Number2);
        String strNum1 = text1.getText().toString();
        String strNum2 = text2.getText().toString();
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        goToActivity2(result);
    }

    public void clickFunctionSub(View view) {
        EditText text1 = (EditText) findViewById(R.id.Number1);
        EditText text2 = (EditText) findViewById(R.id.Number2);
        String strNum1 = text1.getText().toString();
        String strNum2 = text2.getText().toString();
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 - num2;
        goToActivity2(result);
    }

    public void clickFunctionMul(View view) {
        EditText text1 = (EditText) findViewById(R.id.Number1);
        EditText text2 = (EditText) findViewById(R.id.Number2);
        String strNum1 = text1.getText().toString();
        String strNum2 = text2.getText().toString();
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 * num2;
        goToActivity2(result);
    }

    public void clickFunctionDiv(View view) {
        EditText text1 = (EditText) findViewById(R.id.Number1);
        EditText text2 = (EditText) findViewById(R.id.Number2);
        String strNum1 = text1.getText().toString();
        String strNum2 = text2.getText().toString();
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 / num2;
        goToActivity2(result);
    }
    public void goToActivity2(int i){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", i);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}