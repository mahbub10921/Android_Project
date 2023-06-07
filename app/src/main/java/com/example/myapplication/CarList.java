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