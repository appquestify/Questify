package com.app.questify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        ImageView all_question = (ImageView) findViewById(R.id.imgAllQuestion);
        all_question.setClickable(true);
        all_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),   AllQuestions.class);
                startActivity(myIntent);
            }
        });
        ImageView settings = (ImageView) findViewById(R.id.settings);
        all_question.setClickable(true);
        all_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),   SettingsMain.class);
                startActivity(myIntent);
            }
        });
    }

    public void onButtonClick(View v){
        ImageView view = (ImageView) findViewById(v.getId());
        if (v.getId() == R.id.imgAllQuestion ) {
            Intent myIntent = new Intent(getBaseContext(), AllQuestions.class);
            startActivity(myIntent);
        } else if (v.getId() == R.id.settings) {
            Intent myIntent = new Intent(getBaseContext(), SettingsMain.class);
            startActivity(myIntent);
        }
    }

}