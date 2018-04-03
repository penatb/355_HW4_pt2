package com.example.maam1.a355_4pt2;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

public class SQLdb extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "pairs.db";
    private static final String TABLE_NAME = "pairs";
    private static final String COLUMN_OG = "Original";
    private static final String COMLUMN_SYN = "Synonym";
    SQLiteDatabase db;

    private static final String TABLE_CREATE ="create table pairs";

    public SQLdb(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase database){
        db.execSQL(TABLE_CREATE);         // added from vid
        this.db = db;                     // added from vid
        String TABLE_CREATE ="create table pairs";
    }

    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion){

    }

}

