package com.example.practice.introduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;

public class start extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
        tapHelper();
    }

    public void option_0(View view)
    {
        Intent intent = new Intent(start.this, choice_0.class);
        startActivity(intent);
    }
    public void option_1(View view)
    {
        Intent intent = new Intent(start.this, choice_1.class);
        startActivity(intent);
    }

}
