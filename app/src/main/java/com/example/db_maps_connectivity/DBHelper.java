package com.example.db_maps_connectivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "test", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE fruits (f_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT, quality INTEGER );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertRecord(String fruitName,int quality){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("name",fruitName);
        contentValues.put("quality",quality);

        db.insert("fruits",null,contentValues);
    }

    public ArrayList<FruitsModel> getAllData(){

        ArrayList<FruitsModel> arrayList= new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM fruits;",null);

        while (cursor.moveToNext()){
            FruitsModel fruitModel = new FruitsModel(cursor.getString(1),cursor.getInt(2));
            arrayList.add(fruitModel);
            Log.d("test", fruitModel.toString());
        }

        return arrayList;
    }
}
