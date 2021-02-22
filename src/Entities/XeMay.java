package Entities;

public class XeMay extends PTGT {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(int id ,String hangSX, int namSX, double gia, String mau, double congSuat) {
        super(hangSX, namSX, gia, mau,id);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Cong Suat: "+this.congSuat);
        System.out.println("-------------------------------------");
    }
}
