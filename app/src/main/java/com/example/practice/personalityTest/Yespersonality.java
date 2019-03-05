package com.example.practice.personalityTest;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;

public class Yespersonality extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yespersonality);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }
    public void goBack(View view)
    {
        startActivity(Question2.class);
    }
    public void contWalk(View view)
    {
        startActivity(Question2.class);
    }
}
