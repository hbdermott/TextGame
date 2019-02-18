package com.example.practice;

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
    private Queue<Talk> allTalk;
    private Talk currentTalk;
    private AnimationDrawable current;

    private class Talk
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
        allTalk = new LinkedList<>();
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
                if (currentTalk != null) {
                    int color = ((TextView) object).getCurrentTextColor();
                    if (color == getColor(R.color.blueMask))
                        currentTalk.appendResource(bluemask);
                    else if (color == getColor(R.color.redMask))
                        currentTalk.appendResource(redmask);
                    else if (color == getColor(R.color.yellowMask))
                        currentTalk.appendResource(yellowmask);
                    else {
                        Talk a = new Talk();
                        currentTalk = a;
                        allTalk.add(a);
                    }
                }
                else {
                    Talk a = new Talk();
                    currentTalk = a;
                    allTalk.add(a);
                }
                currentTalk.appendText((TextView) object);
            }
            else if (object instanceof ImageView)
            {
                Talk a = new Talk();
                a.appendImage((ImageView)object);
                allTalk.add(a);
                currentTalk = a;
            }
        }
        currentTalk = null;
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
        if (currentTalk != null)
        {
            if (!(currentTalk.textView.isEmpty()))
            {
                visible(currentTalk.textView.remove());
                return;
            }
        }
        if (allTalk.isEmpty() && !(button.isEmpty()))
        {
            int size = button.size();
            for (int i = 0; i < size; i++)
            {
                visible(button.remove());
            }
            current.stop();
            return;
        }
        if (allTalk.isEmpty())
            return;
        if (current != null)
            current.stop();
        currentTalk = allTalk.remove();
        if (currentTalk.imageView != null)
            current = loadGif(currentTalk.imageView, currentTalk.resource);
        if(!(currentTalk.textView.isEmpty()))
            visible(currentTalk.textView.remove());
    }

}
