package com.example.practice;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView image = findViewById(R.id.start_gif_0);
        image.setBackgroundResource(R.drawable.bluemask);
        AnimationDrawable animation = (AnimationDrawable) image.getBackground();
        animation.start();
    }

    protected void option_0(View view)
    {
        Intent intent = new Intent(start.this, choice_0.class);
        startActivity(intent);
    }
    protected void option_1(View view)
    {
        Intent intent = new Intent(start.this, choice_1.class);
        startActivity(intent);
    }

}
