package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home2 extends AppCompatActivity {
Button searchBtn;
EditText editText1;
EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

searchBtn = findViewById(R.id.button3);
editText1 = findViewById(R.id.editTextText1);
        editText2 = findViewById(R.id.editTextText);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String pick = editText2.getText().toString();
String drop = editText1.getText().toString();


                startActivity(new Intent(Home2.this, Option.class));

            }
        });







    }
}