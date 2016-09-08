package com.example.ivan.practiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Ivan on 9/7/2016.
 */
public class ButtonClickFunction {
    private AppCompatActivity appCompatActivity;

    public ButtonClickFunction(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    public void addContents(){
        EditText editFirst = (EditText) appCompatActivity.findViewById(R.id.firstNum);
        int x = Integer.parseInt(editFirst.getText().toString());
        EditText editSecond = (EditText) appCompatActivity.findViewById(R.id.secondNum);
        int y = Integer.parseInt(editSecond.getText().toString());
        int z = Calculator.addNumber(x, y);
        EditText resultText = (EditText) appCompatActivity.findViewById(R.id.resultNum);
        resultText.setText(Integer.toString(z));
    }

    public void clearContents(){
        ((EditText) appCompatActivity.findViewById(R.id.firstNum)).setText("");
        ((EditText) appCompatActivity.findViewById(R.id.secondNum)).setText("");
        ((EditText) appCompatActivity.findViewById(R.id.resultNum)).setText("");
    }
}
