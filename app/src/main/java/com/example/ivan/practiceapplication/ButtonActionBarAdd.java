package com.example.ivan.practiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ivan on 9/8/2016.
 */
public abstract class ButtonActionBarAdd implements TextView.OnEditorActionListener {
    private AppCompatActivity appCompatActivity;
    View component;

    public ButtonActionBarAdd(AppCompatActivity appCompatActivity, View component){
        this.appCompatActivity = appCompatActivity;
        this.component = component;
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
        if(actionId == EditorInfo.IME_ACTION_DONE){
            ButtonClickFunction bcf = new ButtonClickFunction(appCompatActivity);
            StateChanger sc = new StateChanger(appCompatActivity);
            bcf.addContents();
            appCompatActivity.findViewById(R.id.mainLayout).requestFocus();
            sc.hideKeyboard(component);

        }
        return false;
    }
}
