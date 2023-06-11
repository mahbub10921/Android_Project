package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.dao.Database;
import com.example.myapplication.entity.RouteList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Home2 extends AppCompatActivity {
    ArrayList<RouteList> routeArrayList;
Button searchBtn;
double latitude1;
double longitude1;
    double latitude2;
    double longitude2;
    int fare;
    double distance;

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

String pick = editText1.getText().toString();
String drop = editText2.getText().toString();


                Database db = new Database(getApplicationContext(), "healthcare", null, 1);
                routeArrayList = new ArrayList<>();
                routeArrayList = db.getAllRoute();


               for(RouteList fruit:routeArrayList ){

                   if (pick.equalsIgnoreCase(fruit.location)){
                       latitude1 = fruit.latitude;
                       longitude1 = fruit.longitude;
                   }
                   if (drop.equalsIgnoreCase(fruit.location)){
                       latitude2 = fruit.latitude;
                       longitude2 = fruit.longitude;
                   }

               }

CarList carList = new CarList();
              distance =  carList.distance(latitude1,longitude1,latitude2,longitude2, "K");
                System.out.println(distance);
                Toast.makeText(getApplicationContext(), "Record inserted" + distance ,  Toast.LENGTH_SHORT).show();
                SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("dis", "distance");
                editor.apply();




                startActivity(new Intent(Home2.this, Option.class));

            }
        });







    }
}