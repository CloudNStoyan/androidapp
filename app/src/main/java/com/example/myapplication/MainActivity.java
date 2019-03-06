package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView timeView = findViewById(R.id.textView4);
        String timeStamp = String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        timeView.setText(timeStamp);
    }
}
