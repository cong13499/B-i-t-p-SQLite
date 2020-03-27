package com.example.a27320;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class SinhVienDataBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "QUANLYSINHVIEN.db";
    private static final String TABLE_NAME = "SINHVIEN";
    private static final String ID = "ID";
    private static final String TEN = "TEN";
    private static final String NAMSINH= "TUOI";
    private static final String GIOITINH = "GT  ";
    private static final String TRUONG = "TRUONG";
    private static final String SOTHICH = "ST";
    public SinhVienDataBase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE IF NOT EXISTS SV(ID INTEGER PRIMARY KEY AUTOINCREMENT, TEN ten, NAMSINH text, TRUONG text, GIOITINH integer,SOTHICH text)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void ThemSinhVien(SinhVienModel svMoi){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TEN,svMoi.getHoTen());
        values.put(NAMSINH,svMoi.getNamSinh());
        values.put(GIOITINH,svMoi.getGioiTinh());
        values.put(TRUONG,svMoi.getTruong());
        values.put(SOTHICH,svMoi.getSoThich());

        database.insert(TABLE_NAME, null,values);
        database.close();
    }
}
