package com.example.hassan.sqlitecrudapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database="Uni.db";
    public static final String Table="students";

    public DatabaseHelper(Context context)
    {
        super(context,Database,null,1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+Table+" (Id Integer PRIMARY KEY AUTOINCREMENT,NAME TEXT,ROLL_NO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXISTS "+Table+"");
onCreate(db);


    }


}
