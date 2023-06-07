package com.example.myapplication.dao;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.BookingRequest;
import com.example.myapplication.entity.Car;
import com.example.myapplication.entity.Driver;
import com.example.myapplication.entity.Route;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database extends SQLiteOpenHelper {

    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }





    @Override
    public void onCreate(SQLiteDatabase db) {
//String query = "CREATE TABLE" + TABLE_NAME +

        String query2 = "CREATE TABLE USER(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, GENDER TEXT,COURSE TEXT, EMAIL TEXT, PASSWORD TEXT)";
        String query3 = "CREATE TABLE Driver(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, NID TEXT,PHONE TEXT, EMAIL TEXT, ADDRESS TEXT, DISTRICT TEXT)";
        String query4 = "CREATE TABLE Car(ID INTEGER PRIMARY KEY AUTOINCREMENT, REGIS TEXT, CATEGORY TEXT,MODEL TEXT,FARE NUMBER,DRIVERNAME TEXT)";
        String query5 = "CREATE TABLE Request(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, PHONE TEXT,PICK TEXT,DRO TEXT,FARE NUMBER,STATUS BOOLEAN)";
        String query6 = "CREATE TABLE Route(ID INTEGER PRIMARY KEY AUTOINCREMENT, LOCATION TEXT, LATITUDE NUMBER,LONGITUDE NUMBER)";

        db.execSQL(query2);
        db.execSQL(query3);
        db.execSQL(query4);
        db.execSQL(query5);
        db.execSQL(query6);
    }

    public void addNewRequest(BookingRequest bookingRequest){
        SQLiteDatabase sqLiteDatabase1 = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME", bookingRequest.getName());
        values.put("PHONE", bookingRequest.getPhone());
        values.put("PICK", bookingRequest.getPick());
        values.put("DRO", bookingRequest.getDrop());
        values.put("FARE", bookingRequest.getFare());
        values.put("STATUS", bookingRequest.isStatus());
        sqLiteDatabase1.insert("Request",null,values);
        sqLiteDatabase1.close();

    }

    public void addNewRoute(Route route){
        SQLiteDatabase sqLiteDatabase1 = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("LOCATION", route.getLocation());
        values.put("LATITUDE", route.getLatitude());
        values.put("LONGITUDE", route.getLongitude());

        sqLiteDatabase1.insert("Route",null,values);
        sqLiteDatabase1.close();

    }



    public void addNewCar(Car car ){
        SQLiteDatabase sqLiteDatabase1 = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("REGIS", car.getRegis());
        values.put("CATEGORY", car.getCategory());
        values.put("MODEL", car.getModel());
        values.put("FARE", car.getFare());
        values.put("DRIVERNAME", car.getDriverName());
        sqLiteDatabase1.insert("Car",null,values);
        sqLiteDatabase1.close();

    }



    public boolean deleteDriver(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int rowCount = db.delete("Driver", "id = ?", new String[]{id + ""});
        db.close();
        return rowCount > 0;
    }


    public void addNewUser(String userName, String email, String password, String gender, String course ){
        SQLiteDatabase sqLiteDatabase2 = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME", userName);
        values.put("GENDER", gender);
        values.put("EMAIL", email);
        values.put("PASSWORD", password);
        values.put("COURSE", course);
        sqLiteDatabase2.insert("USER",null,values);
        sqLiteDatabase2.close();

    }










    public ArrayList<HashMap<String, String>> getAllCar() {

        SQLiteDatabase db = this.getWritableDatabase();
        @SuppressLint("Recycle") Cursor c = db.rawQuery("select * from Car ", null);

        ArrayList<HashMap<String, String>> carList = new ArrayList<>(c.getCount());
        HashMap<String, String> car;
        if (c.moveToFirst()) {

            do {
                car = new HashMap<>();
                car.put("ID", c.getString(0));
                car.put("REGIS", c.getString(1));
                car.put("MODEL", c.getString(2));
                car.put("CATEGORY", c.getString(3));
                car.put("DRIVERNAME", c.getString(4));



                carList.add(car);

            } while (c.moveToNext());

        }
        db.close();
        return carList;
    }



    public int login(String userName, String password){
        int result = 0;
        String[] arr = new String[2];
        arr[0] = userName;
        arr[1] = password;
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from USER where NAME = ? and PASSWORD = ?" , arr);
        if (cursor.moveToFirst()){
            return 1;
        }
        return result;
    }





    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }




}
