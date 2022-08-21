package com.example.db_handling.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.db_handling.params.params;


public class myDBHandler extends SQLiteOpenHelper {

    public myDBHandler(Context context){
        super(context, params.DB_Name, null, params.DB_Version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }
}
