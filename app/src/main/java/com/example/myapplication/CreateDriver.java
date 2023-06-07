package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.dao.Database;
import com.example.myapplication.entity.Driver;

public class CreateDriver extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    Spinner spinner;
Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_driver);
        editText1 = findViewById(R.id.editTextText2);
        editText2 = findViewById(R.id.editTextText9);
        editText3 = findViewById(R.id.editTextText6);
        editText4 = findViewById(R.id.editTextText4);
                editText5 = findViewById(R.id.editTextText3);
                spinner = findViewById(R.id.spinnerEmpDepartment);
button = findViewById(R.id.button2);
//        Database database = new Database(getApplicationContext(), "healthcare", null,1);
//        database.addNewDriver();

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Driver driver = new Driver();
//                String name = editText1.getText().toString();
//                String email = editText2.getText().toString();
//                String nid = editText3.getText().toString();
//                String address = editText4.getText().toString();
//                String phone = editText5.getText().toString();
//                String district = spinner.getSelectedItem().toString();
//                driver.setName(name);
//                driver.setEmail(email);
//                driver.setNid(nid);
//                driver.setAddress(address);
//                driver.setPhone(phone);
//                driver.setDistrict(district);
//                Database database = new Database(getApplicationContext(), "healthcare", null,1);
//                database.addNewDriver(driver);
//                Toast.makeText(getApplicationContext(), "Record inserted", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(CreateDriver.this, DriverList.class));
//
//            }
//        });



    }
}