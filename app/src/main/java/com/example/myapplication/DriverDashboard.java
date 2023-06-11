package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.dao.Database;

public class DriverDashboard extends AppCompatActivity  {
    Button buttonshow;




    private Handler handler;
    private static final int BLINK_INTERVAL = 500; // Blink interval in milliseconds
    private boolean isButtonVisible = true;

    private void startBlinkAnimation() {
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isButtonVisible) {
                    buttonshow.setVisibility(View.INVISIBLE);
                } else {
                    buttonshow.setVisibility(View.VISIBLE);
                }
                isButtonVisible = !isButtonVisible;
                handler.postDelayed(this, BLINK_INTERVAL);
            }
        }, BLINK_INTERVAL);
    }

    public void stopBlinkAnimation() {
//        if (handler != null) {
////            handler.removeCallbacksAndMessages(null);
//            handler = null;
//        }
//        buttonshow.setVisibility(View.VISIBLE);


    }






     ObjectAnimator blinkAnimator;
     NewRequet newRequet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_dashboard);
        buttonshow = findViewById(R.id.button55);


        startBlinkAnimation();


        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MyDialogFragment dialogFragment = new MyDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "dialog");







//                AlertDialog.Builder builder = new AlertDialog.Builder(DriverDashboard.this); // Replace "YourActivity" with your actual activity name
//
//
//                builder.setTitle("Confirmation");
//                builder.setMessage("Client: Md.Karim" + "Phone: 0191763544" );
//
//
//
//                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int whichButton) {
//
//
//
//
//                        Toast.makeText(getApplicationContext(), "Request Sent!Please Wait to be confirmed", Toast.LENGTH_LONG).show();
//
//                    }
//                });
//
//                // Set negative button with click listener
//                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int whichButton) {
//                        // Perform the desired action when "No" button is clicked
//                        // Add your logic here
//                    }
//                });
//
//                // Create and show the AlertDialog
//                AlertDialog dialog = builder.create();
//                dialog.show();


            }
        });


















        //        private void startBlinkAnimation() {
//            if (blinkAnimator == null) {
//                blinkAnimator = ObjectAnimator.ofFloat(button, "alpha", 0f, 1f);
//                blinkAnimator.setDuration(500); // Duration for one blink cycle (500 milliseconds)
//                blinkAnimator.setRepeatCount(ValueAnimator.INFINITE); // Repeat the animation indefinitely
//                blinkAnimator.setRepeatMode(ValueAnimator.REVERSE); // Reverse the animation on each repeat
//            }
//            blinkAnimator.start();
//        }
//
//
//        private void stopBlinkAnimation() {
//            if (blinkAnimator != null) {
//                blinkAnimator.cancel();
//            }
//        }











    }
}