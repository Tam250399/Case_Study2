package Entities;

public class Oto extends PTGT{
    private int socho;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(String hangSX, int namSX, double gia, String mau, int socho, String kieuDongCo, int id) {
        super(hangSX, namSX, gia, mau, id);
        this.socho = socho;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("So Cho ngoi: "+this.socho);
        System.out.println("Kieu dong co: "+this.kieuDongCo);
        System.out.println("-------------------------------------");
    }
}
