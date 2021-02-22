package Entities;

public class XeTai extends PTGT{
    private double taitrong;

    public XeTai (){

    }

    public XeTai( String hangSX, int namSX, double gia, String mau , double taitrong ,int id) {
        super(hangSX, namSX, gia, mau,id);
        this.taitrong = taitrong;
    }

    public double getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(double taitrong) {
        this.taitrong = taitrong;
    }

    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Trong tai cua xe la: "+this.taitrong);
        System.out.println("-------------------------------------");
    }

}
