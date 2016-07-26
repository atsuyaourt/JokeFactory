package com.example.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView mJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeView = (TextView) findViewById(R.id.joke_textview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String jokeStr = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        if (jokeStr != null && jokeStr.length() > 0)
            mJokeView.setText(jokeStr);
    }
}
