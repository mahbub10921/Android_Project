package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.entity.Driver;

public class Home extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        SharedPreferences preference = getSharedPreferences("shared_prefix", Context.MODE_PRIVATE);
        String name = preference.getString("username", "" );
        Toast.makeText(getApplicationContext(), "welcome" + name + " ",Toast.LENGTH_SHORT).show();
cardView = findViewById(R.id.cardOrderDetails);
cardView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Thik ache", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Home.this, CreateDriver.class));

    }
});




    }
}