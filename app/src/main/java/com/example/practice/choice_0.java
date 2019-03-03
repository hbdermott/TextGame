package com.example.practice;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class choice_0 extends Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_0);
        findViews((ViewGroup) findViewById(R.id.layoutView));
        tapHelper();
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }

    public void girlorBoy(View view)
    {
        Intent intent = new Intent(this, boyvsgirl.class );
        startActivity(intent);
    }
}
