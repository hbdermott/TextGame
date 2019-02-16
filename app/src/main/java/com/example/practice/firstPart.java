package com.example.practice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class firstPart extends AppCompatActivity {
    int numberOfTaps = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_part);
    }

    public void screenTapped(View view) {
        numberOfTaps++;
        switch(numberOfTaps)
        {
            case 1:
                TextView text = findViewById(R.id.textView1);
                text.setVisibility(View.VISIBLE);
                ImageView image = findViewById(R.id.imageView1);
                image.setBackgroundResource(R.drawable.bluemask);
                AnimationDrawable animation = (AnimationDrawable)image.getBackground();
                animation.start();
                break;
            case 2:
                TextView text2 = findViewById(R.id.textView2);
                text2.setVisibility(View.VISIBLE);
                ImageView image2 = findViewById(R.id.imageView2);
                image2.setBackgroundResource(R.drawable.redmask);
                AnimationDrawable animation2 = (AnimationDrawable)image2.getBackground();
                animation2.start();
                break;
            case 3:
                TextView text3 = findViewById(R.id.textView3);
                text3.setVisibility(View.VISIBLE);
                ImageView image3 = findViewById(R.id.imageView3);
                image3.setBackgroundResource(R.drawable.yellowmask);
                AnimationDrawable animation3 = (AnimationDrawable)image3.getBackground();
                animation3.start();
                break;
            case 4:
                TextView text4 = findViewById(R.id.textView4);
                text4.setVisibility(View.VISIBLE);
                Button button1 = findViewById(R.id.button1);
                Button button2 = findViewById(R.id.button2);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                break;
            default:
        }
    }
}
