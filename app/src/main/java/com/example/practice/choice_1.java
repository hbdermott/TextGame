package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class choice_1 extends com.example.practice.Template {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_1);
        init();
    }
    private void init()
    {
        allTalk = new LinkedList<>();
        findViews((ViewGroup)findViewById(R.id.layoutView));
        Talk a = new Talk(3,1,bluemask);
        allTalk.add(a);
        a = new Talk(1,1,redmask);
        allTalk.add(a);
        a = new Talk(1,1,bluemask);
        allTalk.add(a);
        a = new Talk(1,1, redmask);
        allTalk.add(a);
        a = new Talk(1,1,bluemask);
        allTalk.add(a);
        a = new Talk(1,1,redmask);
        allTalk.add(a);
        a = new Talk(1,1,bluemask);
        allTalk.add(a);
        a = new Talk(2,1, yellowmask);
        allTalk.add(a);
        a = new Talk(1,1,bluemask);
        allTalk.add(a);
        a = new Talk(1,1,yellowmask);
        allTalk.add(a);
        a = new Talk(1,1, redmask);
        allTalk.add(a);
        a = new Talk (1,1, bluemask);
        allTalk.add(a);
    }

    protected void screenTapped(View view)
    {
        tapHelper(allTalk);
    }
    protected void option_0(View view)
    {

    }
    protected void option_1(View view)
    {

    }

}
