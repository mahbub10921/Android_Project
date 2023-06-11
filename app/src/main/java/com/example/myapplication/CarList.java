package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.myapplication.dao.Database;

import java.util.ArrayList;

public class CarList extends AppCompatActivity {

    ArrayList carList;
    ImageView delBtn;
    SimpleAdapter sa;


    public  double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        }
        else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                //dist = dist * 1.609344;
                dist = dist * 1.969344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_list);

        Database db = new Database(getApplicationContext(), "healthcare", null, 1);
        carList = new ArrayList<>();
        carList = db.getAllCar();

        sa = new SimpleAdapter(this,
                carList,
                R.layout.driverlist,
                new String[]{"REGIS", "CATEGORY", "MODEL"},
                new int[]{R.id.line_c1, R.id.line_d1, R.id.line_e1 }
        ){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = super.getView(position, convertView, parent);

                //ImageView editBtn = v.findViewById(R.id.emp_edit_btn1);
//                delBtn = v.findViewById(R.id.emp_del_btn1);

//                delBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        HashMap<String, String> driver = new HashMap<>();
//
//                        driver = (HashMap<String, String>) driverList.get(position);
//
//                        boolean deleted = db.deleteDriver(Integer.parseInt(Objects.requireNonNull(driver.get("ID"))));
//                        if (deleted) {
//                            driverList.remove(position);
//                            notifyDataSetChanged();
//                        }
//                        String message = deleted ? "Successfully deleted" : "Failed to delete";
//                        Toast.makeText(CarList.this, message, Toast.LENGTH_SHORT).show();
//                    }
//                });


                return v;

            }

        };


















        ListView lv = findViewById(R.id.listViewUD);
        lv.setAdapter(sa);






    }

}