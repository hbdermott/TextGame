package com.example.practice;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.practice.introduction.start;


public class MainActivity extends AppCompatActivity {
    Intent current = null;
    private static MainActivity instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
    }
    public void start(View view)
    {
        if (current == null) {
            current = new Intent(this, start.class);
            startActivity(current);
        }
        else
        {
            startActivity(current);
        }
    }
    public static MainActivity getInstance()
    {
        return instance;
    }
}
