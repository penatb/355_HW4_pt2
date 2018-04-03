package com.example.    maam1.a355_4pt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NoWord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_word);
    }

    public void return_button(View view)
    {
        startActivityForResult(new Intent(NoWord.this, WelcomeScreen.class), 1);
    }
}
