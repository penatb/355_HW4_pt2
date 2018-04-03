package com.example.maam1.a355_4pt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    public void btn_enter(View view)
    {
        startActivityForResult(new Intent(WelcomeScreen.this, EnterValues.class), 1);
    }

    public void onButtonClick(View view)
    {
        startActivityForResult(new Intent(WelcomeScreen.this, NoWord.class), 1);
    }
}


