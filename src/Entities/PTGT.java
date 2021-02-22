package Entities;

import Behaviors.Management;

import java.io.Serializable;

public class PTGT implements Serializable {
    private String hangSX;
    private int namSX;
    private double gia;
    private String mau;
    private int id;

    public PTGT() {
    }

    public PTGT(String hangSX, int namSX, double gia, String mau,int id) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.gia = gia;
        this.mau = mau;
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void hienThongTin() {
        System.out.println("id : "  + this.id);
        System.out.println("Hang san xuat: " + this.hangSX);
        System.out.println("Nam san xuat: " + this.namSX);
        System.out.println("Gia : " + this.gia);
        System.out.println("Mau: " + this.mau);

    }
}
