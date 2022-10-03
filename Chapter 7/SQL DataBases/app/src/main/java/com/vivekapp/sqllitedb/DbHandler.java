package com.vivekapp.sqllitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHandler extends SQLiteOpenHelper { //SQLiteOpenHelper ekbase clas h joki SQL ki kaam ko karnawne me help karti h
    public DbHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE myemployee (sno INTEGER PRIMARY KEY, name TEXT, increment TEXT)"; //Maine yha database create liya h
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String drop = String.valueOf("DROP TABLE IF EXISTS");
        db.execSQL(drop, new String[]{"myemployee"});
        onCreate(db);
    }

    public void addEmployee(Employee emp){ //Yha humne Employee ki details ko add kiya h
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", emp.getName());
        values.put("increment", emp.getIncrement());
        long k = db.insert("myemployee", null, values); // db.insert ke bare me janne ke liye android ki documentation ko prefer kare
        Log.d("mytag", Long.toString(k)); // yha k ko string me convert kiya taki vo print ho sake
        db.close();
    }

    public void getEmployee(int sno){
        SQLiteDatabase db = this.getReadableDatabase(); //yah mai data ko read kar rha hu to , issiliye main yha getrReadableDatabase ka use ele rha hu
        Cursor cursor = db.query("myemployee", new String[]{"sno", "name", "increment"}, "sno=?", new String[]{String.valueOf(sno)}, null, null, null);
        if(cursor != null && cursor.moveToFirst()){ //Yha per yeh check ho rha h ki kya cursor hmare first value per move hua
            Log.d("mytag name", cursor.getString(1)); //phir yha per hum 1 string ki value fetch kar rhe h
            Log.d("mytag increment", cursor.getString(2)); //phir yha per hum 2 string ki value fetch kar rhe h
        }
        else{
            Log.d("mytag", "Some error occurred");
        }
    }
}