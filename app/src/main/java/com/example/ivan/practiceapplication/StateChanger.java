package com.example.ivan.practiceapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by Ivan on 9/8/2016.
 */
public class StateChanger {
    private AppCompatActivity appCompatActivity;

    public StateChanger(AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;
    }

    public void setTextNumberOnly(){
        EditText edNumFirst = (EditText) appCompatActivity.findViewById(R.id.firstNum);
        EditText edNumSecond = (EditText) appCompatActivity.findViewById(R.id.secondNum);
        EditText edNumResult = (EditText) appCompatActivity.findViewById(R.id.resultNum);
        setReadOnly(edNumResult, true);
        edNumFirst.setRawInputType(InputType.TYPE_CLASS_NUMBER);
        edNumSecond.setRawInputType(InputType.TYPE_CLASS_NUMBER);
    }

    public void setReadOnly(EditText view, boolean readOnly) {
        view.setFocusable(!readOnly);
        view.setFocusableInTouchMode(!readOnly);
        view.setClickable(!readOnly);
        view.setLongClickable(!readOnly);
        view.setCursorVisible(!readOnly);
    }

    public void hideKeyboard(View view){
        ((EditText) appCompatActivity.findViewById(R.id.firstNum)).clearFocus();
        ((EditText) appCompatActivity.findViewById(R.id.secondNum)).clearFocus();
        ((EditText) appCompatActivity.findViewById(R.id.resultNum)).clearFocus();
        (appCompatActivity.findViewById(R.id.mainLayout)).requestFocus();
        InputMethodManager imm = (InputMethodManager) view.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void computeAddWithoutClick(){
        EditText secondNum = (EditText) appCompatActivity.findViewById(R.id.secondNum);
        secondNum.setOnEditorActionListener(new ButtonActionBarAdd(appCompatActivity, secondNum) {});
    }
}
