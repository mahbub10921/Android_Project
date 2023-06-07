package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myapplication.dao.Database;

public class Signup extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    Button btn1;
    CheckBox ssc, hsc;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ed1 = findViewById(R.id.editTextText2);
        ed2 = findViewById(R.id.editTextText3);
        ed3 = findViewById(R.id.editTextText4);
        btn1 = findViewById(R.id.button2);
        ssc = findViewById(R.id.checkBox);
        hsc = findViewById(R.id.checkBox2);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.clearCheck();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radioText = "";
                String CheckBoxText = "";


                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(getApplicationContext(),
                                    "No answer has been selected-(" + selectedId,
                                    Toast.LENGTH_SHORT)
                            .show();
                }
                else {

                    RadioButton radioButton = radioGroup.findViewById(selectedId);

                    // Now display the value of selected item
                    // by the Toast message
                    radioText = radioButton.getText().toString();


                    if(ssc.isChecked()){
                        CheckBoxText +=" " + "SSC";
                    }
                    if(hsc.isChecked()){
                        CheckBoxText +=" " + "HSC";
                    }
                    String userName = ed1.getText().toString();
                    String email = ed2.getText().toString();
                    String password = ed3.getText().toString();


                    Database database = new Database(getApplicationContext(), "healthcare", null,1);

                    if(userName.length()==0 || email.length()==0 || password.length()==0 ){
                        Toast.makeText(getApplicationContext(),"please fill all the Data field.",Toast.LENGTH_SHORT).show();
                    }else{
                       database.addNewUser(userName, email, password, radioText, CheckBoxText);
                        Toast.makeText(getApplicationContext(), "Record inserted", Toast.LENGTH_SHORT).show();
                    }
                }
//                Toast.makeText(getApplicationContext(), "Username :" + userName  + "email :" + email + "password :" + password + "Education" + CheckBoxText + "Gender" + radioText  ,Toast.LENGTH_SHORT  ).show();

            }
        });
    }



}