package com.example.practice.personalityTest;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;

public class Question4 extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }
    public void run(View view)
    {
        startActivity(Question5.class);
    }
    public void notRun(View view)
    {
        startActivity(Question5.class);
    }
}