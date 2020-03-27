package com.example.a27320;

public class SinhVienModel {
    int ID;
    String hoTen, namSinh, truong, soThich;
    int gioiTinh;

    public SinhVienModel(int ID, String hoTen, String namSinh, String truong, String soThich, int gioiTinh) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.truong = truong;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public SinhVienModel(String hoTen, String namSinh, String truong, String soThich, int gioiTinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.truong = truong;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
