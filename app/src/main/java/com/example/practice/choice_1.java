package com.example.practice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class choice_1 extends AppCompatActivity {
    int numberOfTaps = 0;
    int bluemask = R.drawable.bluemask;
    int redmask = R.drawable.redmask;
    int yellowmask = R.drawable.yellowmask;
    AnimationDrawable current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_1);
        ImageView image = findViewById(R.id.imageView);
        image.setBackgroundResource(bluemask);
        AnimationDrawable animation = (AnimationDrawable) image.getBackground();
        current = animation;
        animation.start();
    }
    private void loadGif(int imageView, int resource)
    {
        current.stop();
        ImageView image = findViewById(imageView);
        image.setBackgroundResource(resource);
        AnimationDrawable animation = (AnimationDrawable) image.getBackground();
        current = animation;
        animation.start();
    }
    private void visibleText(int textView)
    {
        TextView text = findViewById(textView);
        text.setVisibility(View.VISIBLE);
    }

    protected void screenTapped(View view)
    {
        numberOfTaps++;
        switch(numberOfTaps)
        {
            case 1:
                visibleText(R.id.textView3);
                break;
            case 2:
                visibleText(R.id.textView4);
                break;
            case 3:
                visibleText(R.id.textView5);
                loadGif(R.id.imageView2, redmask);
                break;
            case 4:
                visibleText(R.id.textView6);
                loadGif(R.id.imageView3, bluemask);
                break;
            case 5:
                visibleText(R.id.textView7);
                loadGif(R.id.imageView4, redmask);
                break;
            case 6:
                visibleText(R.id.textView8);
                loadGif(R.id.imageView5, bluemask);
                break;
            case 7:
                visibleText(R.id.textView9);
                loadGif(R.id.imageView6, redmask);
                break;
            case 8:
                visibleText(R.id.textView10);
                loadGif(R.id.imageView7, bluemask);
                break;
            case 9:
                visibleText(R.id.textView11);
                loadGif(R.id.imageView8, yellowmask);
                break;
            case 10:
                visibleText(R.id.textView12);
                break;
            case 11:
                visibleText(R.id.textView13);
                loadGif(R.id.imageView9, bluemask);
                break;
            case 12:
                visibleText(R.id.textView14);
                loadGif(R.id.imageView10, yellowmask);
                break;
            case 13:
                visibleText(R.id.textView15);
                loadGif(R.id.imageView11, redmask);
                break;
            case 14:
                visibleText(R.id.textView16);
                loadGif(R.id.imageView12, bluemask);
                Button button0 = findViewById(R.id.button2);
                Button button1 = findViewById(R.id.button5);
                button0.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                break;
        }

    }
    protected void option_0(View view)
    {

    }
    protected void option_1(View view)
    {

    }

}
