package com.example.maam1.a355_4pt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EnterValues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_values);
    }

    public void go_go(View view)//button pressed to add new pair of words into database
    {
        startActivityForResult(new Intent(EnterValues.this, WelcomeScreen.class), 1);
        Toast.makeText(this, "Words Saved!", Toast.LENGTH_LONG).show(); //set in if statement. if words saved in Db then return this, else return other
        //Toast.makeText(this, "quorsaaasaint", Toast.LENGTH_LONG).show();
    }
}
