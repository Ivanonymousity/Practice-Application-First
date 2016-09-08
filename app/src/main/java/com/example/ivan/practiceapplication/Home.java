package com.example.ivan.practiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    private StateChanger cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cs = new StateChanger(this);
        cs.setTextNumberOnly();
        cs.computeAddWithoutClick();
    }

    public void addNumber(View v){
        ButtonClickFunction bcf = new ButtonClickFunction(this);
        bcf.addContents();
    }

    public void clearNumber(View v){
        ButtonClickFunction bcf = new ButtonClickFunction(this);
        bcf.clearContents();
    }

    public void loseFocus(View v){
        cs.hideKeyboard(v);
    }
}
