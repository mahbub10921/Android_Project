package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.dao.Database;
import com.example.myapplication.entity.Car;
import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {
MaterialButton materialButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       materialButton = findViewById(R.id.loginbtn);
        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Database database = new Database(getApplicationContext(), "healthcare", null,1);
//                Car car = new Car();
//                car.setRegis("D-JF654");
//                car.setCategory("4 seat");
//                car.setModel("Axio");
//                car.setDriverName("Md Jamal");
//                database.addNewCar(car);
//
//                Car car1 = new Car();
//                car1.setRegis("C-JF654");
//                car1.setCategory("7 seat");
//                car1.setModel("Noah");
//                car1.setDriverName("Md Karim");
//                database.addNewCar(car1);
//
//                Car car2 = new Car();
//                car2.setRegis("K-JF654");
//                car2.setCategory("4 seat");
//                car2.setModel("Premio");
//                car2.setDriverName("Md Hasan");
//                database.addNewCar(car2);
//
//                Car car3 = new Car();
//                car3.setRegis("C-JF654");
//                car3.setCategory("4 seat");
//                car3.setModel("Allion");
//                car3.setDriverName("Md Maruf");
//                database.addNewCar(car3);
//
//                Car car4 = new Car();
//                car4.setRegis("K-JF654");
//                car4.setCategory("7 seat");
//                car4.setModel("Noah");
//                car4.setDriverName("Md Azim");
//                database.addNewCar(car4);
//
//                Toast.makeText(getApplicationContext(), "Record inserted", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Login.this, NavigatioActivity.class));




            }
        });


    }
}