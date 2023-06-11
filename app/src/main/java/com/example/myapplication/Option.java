package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.dao.Database;

public class Option extends AppCompatActivity {
ImageView image;

    ImageView image1;
    ImageView image2;
    ImageView image3;
    TextView x;
    TextView xl;
    TextView premio;
    TextView textView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
        String value = sharedPreferences.getString("dis", "default value");
//        double value2 =  Double.parseDouble(value);
        Toast.makeText(getApplicationContext(), "ashce" + value, Toast.LENGTH_LONG).show();



        image = findViewById(R.id.image1);
        image1 = findViewById(R.id.image2);
        image2 = findViewById(R.id.image3);
        image3 = findViewById(R.id.image4);
x = findViewById(R.id.X);
     xl = findViewById(R.id.XL);
     premio = findViewById(R.id.Premium);
//        TextView = findViewById(R.id.);




        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(Option.this); // Replace "YourActivity" with your actual activity name


                builder.setTitle("Confirmation");
                builder.setMessage("Are you sure you want to confirm?");


                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        Database database = new Database(getApplicationContext(), "healthcare", null,1);
                        BookingRequest bookingRequest = new BookingRequest();
                        bookingRequest.setName("Karim");
                        bookingRequest.setPhone("015347686");
                        bookingRequest.setPick("Khilgaon");
                        bookingRequest.setDrop("Banani");
                        bookingRequest.setFare(300);
                        bookingRequest.setStatus(true);
                        database.addNewRequest(bookingRequest);


                        Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();

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

                AlertDialog.Builder builder = new AlertDialog.Builder(Option.this); // Replace "YourActivity" with your actual activity name


                builder.setTitle("Confirmation");
                builder.setMessage("Are you sure you want to confirm?");


                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        Database database = new Database(getApplicationContext(), "healthcare", null,1);
                        BookingRequest bookingRequest = new BookingRequest();
                        bookingRequest.setName("Karim");
                        bookingRequest.setPhone("015347686");
                        bookingRequest.setPick("Khilgaon");
                        bookingRequest.setDrop("Banani");
                        bookingRequest.setFare(300);
                        bookingRequest.setStatus(true);
                        database.addNewRequest(bookingRequest);


                        Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();

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


        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder builder = new AlertDialog.Builder(Option.this); // Replace "YourActivity" with your actual activity name


                builder.setTitle("Confirmation");
                builder.setMessage("Are you sure you want to confirm?");


                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        Database database = new Database(getApplicationContext(), "healthcare", null,1);
                        BookingRequest bookingRequest = new BookingRequest();
                        bookingRequest.setName("Karim");
                        bookingRequest.setPhone("015347686");
                        bookingRequest.setPick("Khilgaon");
                        bookingRequest.setDrop("Banani");
                        bookingRequest.setFare(300);
                        bookingRequest.setStatus(true);
                        database.addNewRequest(bookingRequest);


                        Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();

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







    }
}