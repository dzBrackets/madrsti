package com.example.madrsti;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
   private Context context;
    private static String DATABASE_NAME="questions.db";
    private static String table_Name="ghanou";
    private static String col1="ID";
    private static String col2="question";
    private static String col3="S1";
    private static String col4="S2";
    private static String col5="S3";
    private static String col6="S4";
    private static String col7="Qs";
    private static String col8="NumQ";
    private static String col9="TypeQ";



    public DataBaseHelper(Context context ){
        super(context,DATABASE_NAME, null, 1);
        SQLiteDatabase db =this.getWritableDatabase();
        this.context=context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String create="CREATE TABLE "+table_Name+" ( "+col1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+col2+" VARCHAR(25) NOT NULL, "+col3
                +" VARCHAR(25) NOT NULL, "+col4+" VARCHAR(25) NOT NULL, "+col5+" VARCHAR(25) NOT NULL, "+col6+" VARCHAR(25) NOT NULL, "+col7+" VARCHAR(25) NOT NULL, "+
                col8+" INTEGER, "+col9+" VARCHAR(25))";
        String req="CREATE TABLE "+table_Name+" ( "+
                col1+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                col2+" VARCHAR(50), "+
                col3+" CHARACTER(15), "+
                col4+" CHARACTER(15), "+
                col5+" CHARACTER(15), "+
                col6+" CHARACTER(15), "+
                col7+" CHARACTER(15), "+
                col8+" INTEGER, "+
                col9+" CHARACTER(5))";
        db.execSQL(create);
        //db.execSQL("CREATE TABLE ghanou (ID INTEGER PRIMARY KEY AUTOINCREMENT,question VARCHAR(50),S1 CHARACTER(15),S2 CHARACTER(15),S3 CHARACTER(15),S4 CHARACTER(15),Qs CHARACTER(15),NumQ INTEGER,TypeQ CHARACTER(5));");
        //insertData();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String req ="DROP TABLE IF EXISTS "+table_Name+";";
        db.execSQL(req);
        onCreate(db);
    }
    private void insertData(){
        insertMath();
    }
    private void insertMath(){


    }
}
