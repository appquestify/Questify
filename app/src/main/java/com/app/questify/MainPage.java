package com.app.questify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void onButtonClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   AllQuestions.class);
        startActivity(myIntent);
    }
}