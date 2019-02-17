package com.example.practice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;

public class Template extends AppCompatActivity {

    public final int bluemask = R.drawable.bluemask;
    public final int redmask = R.drawable.redmask;
    public final int yellowmask = R.drawable.yellowmask;
    public Queue<TextView> text;
    public Queue<ImageView> image;
    public Queue<Button> button;
    public Queue<Talk> allTalk;
    public Talk currentTalk;
    AnimationDrawable current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class Talk
    {
        Talk(int textNum, int imageNum, int value)
        {
            for (int i = 0; i < textNum; i++)
            {
                textView.add(text.remove());
            }
            for (int i = 0; i < imageNum; i++)
            {
                imageView.add(image.remove());
            }
            resource = value;
        }
        Queue<TextView> textView = new LinkedList<>();
        Queue<ImageView> imageView = new LinkedList<>();
        int resource;
    }

    public void findViews(ViewGroup v)
    {
        text = new LinkedList<>();
        image = new LinkedList<>();
        button = new LinkedList<>();
        int size = v.getChildCount();
        for (int i = 0; i < size; i++)
        {
            View object = v.getChildAt(i);
            if (object instanceof TextView)
            {
                text.add((TextView)object);
            }
            if (object instanceof ImageView)
            {
                image.add((ImageView)object);
            }
            if (object instanceof Button)
            {
                button.add((Button)object);
            }
        }
    }


    public AnimationDrawable loadGif(int imageView, int resource)
    {
     ImageView image = findViewById(imageView);
     image.setBackgroundResource(resource);
     AnimationDrawable animation = (AnimationDrawable) image.getBackground();
     animation.start();
     return animation;
    }

    public AnimationDrawable loadGif(ImageView image, int resource)
    {
        image.setBackgroundResource(resource);
        AnimationDrawable animation = (AnimationDrawable) image.getBackground();
        animation.start();
        return animation;
    }

    public void visible (int view)
    {
        View object = findViewById(view);
        object.setVisibility(View.VISIBLE);
    }
    public void visible (View v)
    {
        v.setVisibility(View.VISIBLE);
    }

    protected void tapHelper(Queue<Talk> array)
    {
        if (currentTalk != null)
        {
            if (!(currentTalk.textView.isEmpty()))
            {
                visible(currentTalk.textView.remove());
                return;
            }
        }
        if (array.isEmpty() && !(button.isEmpty()))
        {
            int size = button.size();
            for (int i = 0; i < size; i++)
            {
                visible(button.remove());
            }
            current.stop();
            return;
        }
        if (array.isEmpty())
            return;
        if (current != null)
            current.stop();
        currentTalk = array.remove();
        if (!(currentTalk.imageView.isEmpty()))
            current = loadGif(currentTalk.imageView.remove(), currentTalk.resource);
        if(!(currentTalk.textView.isEmpty()))
            visible(currentTalk.textView.remove());
    }

}
