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
        insertData();

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

        SQLiteDatabase dbb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        int a,b,c,d,sol;
        int i1=0,i2=0,i3=0,i4=0;
        for (int i=1;i<11;i++){
            do{
                i1= (int) Math.random()*10+3;
            }while (i1<7 && i1>2 );
            do{
                i2= (int) Math.random()*10+3;
            }while (i2<7 && i2>2 && i2!=i1 );
            do{
                i3= (int) Math.random()*10+3;
            }while (i3<7 && i3>2 && i3!=i1&& i3!=i2);
            do{
                i4= (int) Math.random()*10+3;
            }while (i4<7 && i4>2 && i4!=i3 && i4!=i1 && i4!=i2);
            switch (i){
                case 1:
                    //a+b
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;
                    sol=a+b;

                    contentValues.put(col2,Integer.toString(a)+"+"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 1);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 2:
                    //a+b
                    a= (int) (Math.random() * 10) +10;
                    b= (int) (Math.random() * 10) +10;
                    sol=a+b;

                    contentValues.put(col2,Integer.toString(a)+"+"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 2);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 3:
                    //a-b
                    a= (int) (Math.random() * 10) +1;
                    do{
                        b= (int) (Math.random() * 10) +1;
                    }while (b>=a);

                    sol=a-b;

                    contentValues.put(col2,Integer.toString(a)+"-"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 3);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 4:
                    //a-b
                    a= (int) (Math.random() * 10) +20;
                    do{
                        b= (int) (Math.random() * 10) +10;
                    }while (b>=a);

                    sol=a-b;

                    contentValues.put(col2,Integer.toString(a)+"-"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 4);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 5:
                    //a*b
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;

                    sol=a*b;

                    contentValues.put(col2,Integer.toString(a)+"x"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 5);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 6:
                    //a/b
                    b= (int) (Math.random() * 10) +1;
                    a= (int) (Math.random()*10+1)*b;

                    sol=a/b;

                    contentValues.put(col2,Integer.toString(a)+"/"+Integer.toString(b));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 6);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 7:
                    //a+b+c
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;
                    c= (int) (Math.random() * 10) +10;

                    sol=a+b+c;

                    contentValues.put(col2,Integer.toString(a)+"+"+Integer.toString(b)+"+"+Integer.toString(c));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 7);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 8:
                    //a+b-c
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;
                    do{
                        c= (int) (Math.random() * 20) +1;
                    }while (c>=a+b);

                    sol=a+b-c;

                    contentValues.put(col2,Integer.toString(a)+"+"+Integer.toString(b)+"-"+Integer.toString(c));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 8);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 9:
                    //a*b+c
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;
                    c= (int) (Math.random() * 15) +1;

                    sol=a*b+c;

                    contentValues.put(col2,Integer.toString(a)+"*"+Integer.toString(b)+"+"+Integer.toString(c));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 9);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
                case 10:
                    //a*b+c*d
                    a= (int) (Math.random() * 10) +1;
                    b= (int) (Math.random() * 10) +1;
                    c= (int) (Math.random() * 10) +1;
                    d= (int) (Math.random() * 10) +1;

                    sol=a+b+c*d;

                    contentValues.put(col2,Integer.toString(a)+"+"+Integer.toString(b)+"+"+Integer.toString(c)+"*"+Integer.toString(d));
                    contentValues.put("col"+i1, sol);
                    contentValues.put("col"+i2, sol-1);
                    contentValues.put("col"+i3, sol+1);
                    contentValues.put("col"+i4, sol+4);
                    contentValues.put(col7, sol);
                    contentValues.put(col8, 10);
                    contentValues.put(col9, "math");
                    dbb.insert(table_Name, null , contentValues);
                    break;
            }
        }
    }
}
