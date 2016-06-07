package com.android.portfolio.myportfolio.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleMediaStreamerEvent(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the spotify streamer";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void handleSuperDuo1Event(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the scores app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void handleSuperDuo2Event(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the library app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void handleAntTerminatorEvent(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the build it bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void handleMaterializeEvent(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the bacon bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void handleCapstoneEvent(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the capstone:my own app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
