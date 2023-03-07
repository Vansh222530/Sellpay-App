package com.example.sellpay.db;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHandler extends SQLiteOpenHelper
{

    DbHandler(Activity a)
    {
        super(a,"Customer",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String sql="CREATE TABLE IF NOT EXISTS CustomerData(Cid INTEGER,Name TEXT,Address TEXT,MobileNo NUMBER(10),AadharCardNo INTEGER(12),PanCardNo number(12));";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
    public void insertData(int Id,String name,String Address,int Contact,int AC,int PC)
    {
        ContentValues cv=new ContentValues();
        cv.put("ID",Id);
        cv.put("Name",name);
        cv.put("Address",Address);
        cv.put("ContactNo",Contact);
        cv.put("AadharCardNo",AC);
        cv.put("PanCardNo",PC);
        SQLiteDatabase db =getWritableDatabase();
        db.insert("CustomerData",null,cv);
    }
    public void updateData(int Id,String NewName,String NewAddress,int NewContact,int NewAc,int NewPC)
    {
        ContentValues cv=new ContentValues();
        cv.put("ID",Id);
        cv.put("NewName",NewName);
        cv.put("NewAddress",NewAddress);
        cv.put("NewContactNo",NewContact);
        cv.put("NewAadharCardNo",NewAc);
        cv.put("NewPanCardNo",NewPC);
        SQLiteDatabase db=getWritableDatabase();
        db.update("CustomerData",cv,"ID",(new String[]{Id+""}));
    }
    public void deleteData(int Id)
    {
        SQLiteDatabase db= getWritableDatabase();
        db.delete("CustomerData","ID",(new String[]{Id+""}));
    }
    public Cursor displayData()
    {
        String sql = "SELECT *From CustomerData;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(sql,null);
        return c;
    }
}