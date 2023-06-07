package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Option extends AppCompatActivity {
ImageView image;

    ImageView image1;
    ImageView image2;
    ImageView image3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        image = findViewById(R.id.image1);
        image1 = findViewById(R.id.image2);
        image2 = findViewById(R.id.image3);
        image3 = findViewById(R.id.image4);




        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Option.this); // Replace "YourActivity" with your actual activity name

                // Set the dialog properties
                builder.setTitle("Confirmation");
                builder.setMessage("Are you sure you want to confirm?");

                // Set positive button with click listener
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();
                        // Add your logic here
                    }
                });

                // Set negative button with click listener
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Perform the desired action when "No" button is clicked
                        // Add your logic here
                    }
                });

                // Create and show the AlertDialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });



        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();




            }
        });


        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();




            }
        });







    }
}