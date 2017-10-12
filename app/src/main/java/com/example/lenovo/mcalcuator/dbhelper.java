package com.example.lenovo.mcalcuator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LENOVO on 2/23/2017.
 */

public class dbhelper extends SQLiteOpenHelper{
               static int DATABASE_VERSION=1;
                 static String DATABASE_NAME="Phonebook";
                public dbhelper(Context c)
                 {
                     super(c,DATABASE_NAME,null,DATABASE_VERSION);
                 }


    @Override
    public void onCreate(SQLiteDatabase db) {
            String create_table_statement="Create table info(id integer auto increment primary key," +
                    " name text not null, phone text not null);";
            String insert_joy="INSERT INTO INFO VALUES(1,'JOY','9123');";
            String insert_mp="INSERT INTO INFO VALUES(2,'MP','9124');";
             String insert_MN="INSERT INTO INFO VALUES(3,'MN','9125');";
            db.execSQL(create_table_statement);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
