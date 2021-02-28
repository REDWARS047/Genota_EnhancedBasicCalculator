package com.example.genota_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnMod = findViewById(R.id.btnMod);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        EditText operand1 = findViewById(R.id.txtOperand1);
        EditText operand2 = findViewById(R.id.txtOperand2);
        TextView answer = findViewById(R.id.txtAnswer);

        double op1 = 0.0;
        double op2 = 0.0;

        op1 = Double.parseDouble(operand1.getText().toString());
        op2 = Double.parseDouble(operand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAdd:
                answer.setText(Double.toString(doAddition(op1, op2)));
                break;
            case R.id.btnSub:
                answer.setText(Double.toString(doSubtraction(op1, op2)));
                break;
            case R.id.btnDiv:
                answer.setText(Double.toString(doDivision(op1, op2)));
                break;
            case R.id.btnMul:
                answer.setText(Double.toString(doMultiplication(op1, op2)));
                break;
            case R.id.btnMod:
                answer.setText(Double.toString(doModulo(op1, op2)));
                break;
        }
    }

    public static double doAddition(double op1, double op2){
        return op1 + op2;
    }
    public static double doDivision(double op1, double op2){
        return op1 / op2;
    }
    public static double doSubtraction(double op1, double op2){
        return op1 - op2;
    }
    public static double doMultiplication(double op1, double op2){
        return op1 * op2;
    }
    public static double doModulo(double op1, double op2){
        return op1 % op2;
    }

}