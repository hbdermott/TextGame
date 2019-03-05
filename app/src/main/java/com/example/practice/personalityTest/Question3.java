package com.example.practice.personalityTest;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;

public class Question3 extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }

    public void sorry(View view)
    {
        startActivity(Question4.class);
    }
    public void yourFault(View view)
    {
        startActivity(Question4.class);
    }
}