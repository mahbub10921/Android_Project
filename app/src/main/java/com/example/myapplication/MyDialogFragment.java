package com.example.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Configure the dialog
        builder.setTitle("Booking Details")
                .setMessage("Client:Maruf\n"   + "Phone:015344758\n" +  "Pickup:Khilgaon\n" + "Dropup: Banani\n" +  "Fare:300\n")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle positive button click
                        Toast.makeText(getActivity(), "Hello Toast!!", Toast.LENGTH_SHORT).show();
                        DriverDashboard driverDashboard = new DriverDashboard();
                        driverDashboard.stopBlinkAnimation();
                        dialog.dismiss();
                        // Close the dialog
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle negative button click
                        dialog.dismiss(); // Close the dialog
                    }
                });

        return builder.create();
    }



}
