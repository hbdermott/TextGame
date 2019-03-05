package com.example.practice.introduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice.R;
import com.example.practice.Template;
import com.example.practice.personalityTest.Nopersonality;
import com.example.practice.personalityTest.Yespersonality;

public class boyvsgirl extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyvsgirl);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }

    public void yes(View view)
    {
        Intent intent = new Intent(this, Yespersonality.class);
        startActivity(intent);
    }
    public void no(View view)
    {
        Intent intent = new Intent(this, Nopersonality.class);
        startActivity(intent);
    }
}
