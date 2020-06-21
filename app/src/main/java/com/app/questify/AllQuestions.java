package com.app.questify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllQuestions extends AppCompatActivity {
    private EditText name;
    private EditText passWord;
    private TextView info;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_questions);

        //name = (EditText) findViewById(R.id.etName);
        //passWord = (EditText) findViewById(R.id.eTPassword);
        //info = (TextView) findViewById(R.id.tvInfo);
        //login = (Button) findViewById(R.id.btnLogin);
    }

    public void onButtonClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   MainPage.class);
        startActivity(myIntent);
    }

}