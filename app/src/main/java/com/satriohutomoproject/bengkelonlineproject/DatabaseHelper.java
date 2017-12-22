package com.satriohutomoproject.bengkelonlineproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aura comp on 5/26/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Kelon.db";
    public static final String TABLE_NAME="user_table";
    public static final String KOL_1="ID";
    public static final String KOL_2="NAMA";
    public static final String KOL_3="ALAMAT";
    public static final String KOL_4="NOMER";
    public static final String KOL_5="EMAIL";
    public static final String KOL_6="SANDI";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_NAME + " (" +
                KOL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                KOL_2 + " TEXT NOT NULL, " +
                KOL_3 + " TEXT NOT NULL, " +
                KOL_4 + " TEXT NOT NULL, " +
                KOL_5 + " TEXT NOT NULL, " +
                KOL_6 + " TEXT NOT NULL);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String nama, String alamat, String nomer, String email, String sandi){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(KOL_2,nama);
        contentValues.put(KOL_3,alamat);
        contentValues.put(KOL_4,nomer);
        contentValues.put(KOL_5,email);
        contentValues.put(KOL_6,sandi);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }

    public Cursor getdata(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }
}
