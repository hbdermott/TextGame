package com.example.practice;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
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
    private Queue<Button> button;
    private Queue<Tap> allTap;
    private Tap currentTap;
    private AnimationDrawable current;

    private class Tap
    {
        private void appendImage(ImageView view)
        {
            imageView = view;
        }
        private void appendText(TextView view)
        {
            textView.add(view);
        }
        private void appendResource(int resourceValue)
        {
            resource = resourceValue;
        }
        private ImageView imageView = null;
        private Queue<TextView> textView = new LinkedList<>();
        private int resource;
    }

    public void findViews(ViewGroup v)
    {
        allTap = new LinkedList<>();
        button = new LinkedList<>();
        int size = v.getChildCount();
        for (int i = 0; i < size; i++)
        {
            View object = v.getChildAt(i);
            if (object instanceof Button)
            {
                button.add((Button)object);
            }
            else if (object instanceof TextView)
            {
                if (currentTap != null) {
                    int color = ((TextView) object).getCurrentTextColor();
                    if (color == getColor(R.color.blueMask))
                        currentTap.appendResource(bluemask);
                    else if (color == getColor(R.color.redMask))
                        currentTap.appendResource(redmask);
                    else if (color == getColor(R.color.yellowMask))
                        currentTap.appendResource(yellowmask);
                    else {
                        Tap a = new Tap();
                        currentTap = a;
                        allTap.add(a);
                    }
                }
                else {
                    Tap a = new Tap();
                    currentTap = a;
                    allTap.add(a);
                }
                currentTap.appendText((TextView) object);
            }
            else if (object instanceof ImageView)
            {
                Tap a = new Tap();
                a.appendImage((ImageView)object);
                allTap.add(a);
                currentTap = a;
            }
        }
        currentTap = null;
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

    protected void tapHelper()
    {
        if (currentTap != null)
        {
            if (!(currentTap.textView.isEmpty()))
            {
                visible(currentTap.textView.remove());
                return;
            }
        }
        if (allTap.isEmpty() && !(button.isEmpty()))
        {
            int size = button.size();
            for (int i = 0; i < size; i++)
            {
                visible(button.remove());
            }
            current.stop();
            return;
        }
        if (allTap.isEmpty())
            return;
        if (current != null)
            current.stop();
        currentTap = allTap.remove();
        if (currentTap.imageView != null)
            current = loadGif(currentTap.imageView, currentTap.resource);
        if(!(currentTap.textView.isEmpty()))
            visible(currentTap.textView.remove());
    }
    public void screenTapped(View view)
    {
        tapHelper();
    }
    public void onPause()
    {
        super.onPause();
        MainActivity.getInstance().current = new Intent(this, getClass());
    }
}
