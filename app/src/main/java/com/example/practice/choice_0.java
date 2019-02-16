package com.example.practice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class choice_0 extends AppCompatActivity {
    public class Talk
    {
        public String string;
        public String color;
    }

    int numberOfTaps = 0;
    AnimationDrawable bluemask;
    AnimationDrawable redmask;
    AnimationDrawable yellowmask;
    AnimationDrawable current;
    TextView blueText;
    TextView redText;
    TextView yellowText;
    Talk[] values;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_0);
        values = new Talk[25];
        blueText = findViewById(R.id.bluetext);
        redText = findViewById(R.id.redtext);
        yellowText = findViewById(R.id.yellowtext);
        ImageView blue = findViewById(R.id.bluemask_gif);
        ImageView red = findViewById(R.id.redmask_gif);
        ImageView yellow = findViewById(R.id.yellowmask_gif);
        blue.setBackgroundResource(R.drawable.bluemask);
        red.setBackgroundResource(R.drawable.redmask);
        yellow.setBackgroundResource(R.drawable.yellowmask);
        bluemask = (AnimationDrawable) blue.getBackground();
        redmask = (AnimationDrawable) red.getBackground();
        yellowmask = (AnimationDrawable) yellow.getBackground();
        initStrings();
        blue.setVisibility(View.VISIBLE);
        current = bluemask;
        current.start();
        blueText.setText(values[0].string);
    }

    private void initStrings()
    {
        for (int i = 0; i < 25; i++)
        {
            values[i] = new Talk();
        }
        values[0].string = "I love how you guys never take anything seriously. Makes it super fun whenever I plan things like this. Suuuuper fun. Maybe if I specifically tell you to be here at a certain time, then you should be here.";
        values[0].color = "blue";
        values[1].string = "I’m here, geez. I was finishing my last character sheet.";
        values[1].color = "red";
        values[2].string = "Also, when have I ever not been serious? I’m Mr. Serious. No smile here. Nada.";
        values[2].color = "red";
        values[3].string = "Whatever, yeah. I just want to go over the plan before he gets here.";
        values[3].color = "blue";
        values[4].string = "Wait, he? You definitely said it was going to be a she.";
        values[4].color = "red";
        values[5].string = "Uh, no. He.";
        values[5].color = "blue";
        values[6].string = "You’ve been calling her a she this whole time! As in “She won’t know what hit her” and “She’ll be crying herself to sleep after this.” Sound familiar?";
        values[6].color = "red";
        values[7].string = "Okay, it’s possible that those things were said by me. It doesn’t matter.";
        values[7].color = "blue";
        values[8].string = "I’ve been picturing a she this whole time :( You’re messing with my vibe.";
        values[8].color = "red";
        values[9].string = "Red, c’mon dude. I need to make sure we’re on the same page with this thing. The plan, not the gender.";
        values[9].color = "blue";
        values[10].string = "What about Yellow? We need to wait for her to get on before we start, right?";
        values[10].color = "red";
        values[11].string = "She knows what to do. And she’ll be here.";
        values[11].color = "blue";
        values[12].string = "...";
        values[12].color = "red";
        values[13].string = "So that whole rant earlier was just directed towards me?";
        values[13].color = "red";
        values[14].string = "Hi, you two.";
        values[14].color = "yellow";
        values[15].string = "Hi, Yellow. For the record, isn’t our guest going to be a he?";
        values[15].color = "blue";
        values[16].string = "That was my understanding.";
        values[16].color = "yellow";
        values[17].string = "See?!";
        values[17].color = "blue";
        values[18].string = "But you have been calling it a she. It’s unclear.";
        values[18].color = "yellow";
        values[19].string = "HA! I think it’s a she. I’m almost certain.";
        values[19].color = "red";
        values[20].string = "Personally, I imagined it as a he.";
        values[20].color = "yellow";
        values[21].string = "Yeah, yeah, enough about the gender thing. Let’s talk shop. Yellow, are you still good with the Mystic Route?";
        values[21].color = "blue";
        values[22].string = "Blue, should we really be talking about this in front of him?";
        values[22].color = "yellow";
        values[23].string = "WHAT?";
        values[23].color = "blue";
        values[24].string = "Yes, he’s been here for a minute or so. Sorry, are you a girl or a boy?";
        values[24].color = "yellow";
    }

    protected void screenTapped(View view)
    {
        if (numberOfTaps == 24)
        {
            current.stop();
            Button button0 = findViewById(R.id.option_0);
            Button button1 = findViewById(R.id.option_1);
            button0.setVisibility(View.VISIBLE);
            button1.setVisibility(View.VISIBLE);
            return;
        }
        else if (numberOfTaps > 24)
            return;
        numberOfTaps++;
        TextView text;
        current.stop();
        if (values[numberOfTaps].color.equals("blue"))
        {
            findViewById(R.id.bluemask_gif).setVisibility(View.VISIBLE);
            current = bluemask;
            text = blueText;
        }
        else if (values[numberOfTaps].color.equals("red"))
        {
            findViewById(R.id.redmask_gif).setVisibility(View.VISIBLE);
            current = redmask;
            text = redText;
        }
        else
        {
            findViewById(R.id.yellowmask_gif).setVisibility(View.VISIBLE);
            current = yellowmask;
            text = yellowText;
        }
        text.setText(values[numberOfTaps].string);
        current.start();

    }
    protected void option_0(View view)
    {

    }
    protected void option_1(View view)
    {

    }

}
