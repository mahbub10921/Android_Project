package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.dao.Database;
import com.example.myapplication.entity.Car;
import com.example.myapplication.entity.Route;
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

                Database database = new Database(getApplicationContext(), "healthcare", null,1);
                Car car = new Car();
                car.setRegis("D-JF654");
                car.setCategory("4 seat");
                car.setModel("Axio");
                car.setFare(50);
                car.setDriverName("Md Jamal");
                database.addNewCar(car);

                Car car1 = new Car();
                car1.setRegis("C-JF654");
                car1.setCategory("7 seat");
                car1.setModel("Noah");
                car1.setFare(80);
                car1.setDriverName("Md Karim");
                database.addNewCar(car1);

                Car car2 = new Car();
                car2.setRegis("K-JF654");
                car2.setCategory("4 seat");
                car2.setModel("Premio");
                car2.setFare(70);
                car2.setDriverName("Md Hasan");
                database.addNewCar(car2);

                Car car3 = new Car();
                car3.setRegis("C-JF654");
                car3.setCategory("4 seat");
                car3.setModel("Allion");
                car3.setFare(50);
                car3.setDriverName("Md Maruf");
                database.addNewCar(car3);

                Car car4 = new Car();
                car4.setRegis("K-JF654");
                car4.setCategory("7 seat");
                car4.setModel("Noah");
                car4.setFare(80);
                car4.setDriverName("Md Azim");
                database.addNewCar(car4);

                Toast.makeText(getApplicationContext(), "Record inserted", Toast.LENGTH_SHORT).show();


                Route route = new Route();
                route.setLocation("Basabo");
                route.setLatitude(23.742810644669024);
                route.setLongitude(90.43087382292659);
                database.addNewRoute(route);

                Route kazi = new Route();
                kazi.setLocation("Kazipara");
                kazi.setLatitude(23.79940524882003);
                kazi.setLongitude(90.37182231087452);
                database.addNewRoute(kazi);

                Route mo = new Route();
                mo.setLocation("Mohammadpur");
                mo.setLatitude(23.74603182472281);
                mo.setLongitude( 90.3740109906217);
                database.addNewRoute(mo);


                Route jat = new Route();
                jat.setLocation("Jatrabari");
                jat.setLatitude(23.711576864895765);
                jat.setLongitude(90.43447870933895);
                database.addNewRoute(jat);


                Route mirpur = new Route();
                mirpur.setLocation("Mirpur10");
                mirpur.setLatitude(23.808122013011626);
                mirpur.setLongitude(90.37001986451726);
                database.addNewRoute(mirpur);

                Route agar = new Route();
                agar.setLocation("Agargaon");
                agar.setLatitude(23.778178262503424);
                agar.setLongitude(90.37959106407965);
                database.addNewRoute(agar);

                Route mali = new Route();
                mali.setLocation("Abul Hotel,Malibagh,Dhaka");
                mali.setLatitude(23.754285707376678);
                mali.setLongitude(90.41593784085504);
                database.addNewRoute(mali);

                Route moti = new Route();
                moti.setLocation("Motijheel");
                moti.setLatitude(23.77847479920561);
                moti.setLongitude(90.38014788528353);
                database.addNewRoute(moti);

                Route basu1 = new Route();
                basu1.setLocation("Bashundhara City Shopping Complex,Dhaka");
                basu1.setLatitude(23.749961792896833);
                basu1.setLongitude(90.3886410599775);
                database.addNewRoute(basu1);

                Route basu2 = new Route();
                basu2.setLocation("Bashundhara Residential Area,Dhaka");
                basu2.setLatitude(23.77847479920561);
                basu2.setLongitude(90.38014788528353);
                database.addNewRoute(basu2);

                Route basu3 = new Route();
                basu3.setLocation("Banani DOHS");
                basu3.setLatitude(23.79630502281683);
                basu3.setLongitude(90.39851158929955);
                database.addNewRoute(basu3);

                Route basu4 = new Route();
                basu4.setLocation("Baridhara");
                basu4.setLatitude(23.77847479920561);
                basu4.setLongitude(90.38014788528353);
                database.addNewRoute(basu4);

                Route basu5 = new Route();
                basu5.setLocation("Banani Super Market");
                basu5.setLatitude(23.79630502281683);
                basu5.setLongitude(90.39851158929955);
                database.addNewRoute(basu5);

                Route basu6 = new Route();
                basu6.setLocation("Banani Club");
                basu6.setLatitude(23.79630502281683);
                basu6.setLongitude(90.39851158929955);
                database.addNewRoute(basu6);

                Route basu7 = new Route();
                basu7.setLocation("Hazrat Shahjalal International Airport,Dhaka");
                basu7.setLatitude(23.850632347270384);
                basu7.setLongitude(90.40434141338267);
                database.addNewRoute(basu7);

                Route basu9 = new Route();
                basu9.setLocation("Airport Railway Station,Dhaka");
                basu9.setLatitude(23.850632347270384);
                basu9.setLongitude(90.40434141338267);
                database.addNewRoute(basu9);

                Route basu8 = new Route();
                basu8.setLocation("Banani Graveyard");
                basu8.setLatitude(23.79630502281683);
                basu8.setLongitude(90.39851158929955);
                database.addNewRoute(basu8);

                Route basu10 = new Route();
                basu10.setLocation("Khilgaon Police Fari,Khilgaon,Dhaka");
                basu10.setLatitude(23.748469109329964);
                basu10.setLongitude(90.42614907083258);
                database.addNewRoute(basu10);

                Route basu11 = new Route();
                basu11.setLocation("Khilgaon Model Schhol And College,Khilgaon,Dhaka");
                basu11.setLatitude(23.748469109329964);
                basu11.setLongitude(90.42614907083258);
                database.addNewRoute(basu1);

                Route basu12 = new Route();
                basu12.setLocation("Khilgaon Railgate,Khilgaon,Dhaka");
                basu12.setLatitude(23.748469109329964);
                basu12.setLongitude(90.42614907083258);
                database.addNewRoute(basu12);

                startActivity(new Intent(Login.this, Home2.class));




            }
        });


    }
}