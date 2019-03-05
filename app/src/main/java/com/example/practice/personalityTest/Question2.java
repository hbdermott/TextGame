package com.example.practice.personalityTest;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;

public class Question2 extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }

    public void goWith(View view)
    {
        startActivity(Question3.class);
    }
    public void goWithout(View view)
    {
        startActivity(Question3.class);
    }
}