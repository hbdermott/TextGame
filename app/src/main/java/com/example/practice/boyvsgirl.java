package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

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
