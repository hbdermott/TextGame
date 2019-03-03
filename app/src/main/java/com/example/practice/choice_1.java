package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class choice_1 extends com.example.practice.Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_1);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
}
