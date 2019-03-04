package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class Nopersonality extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nopersonality);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }
}
