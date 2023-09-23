package okul_Programi;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci extends Kisi{
    static Map<String,Ogrenci> ogrenciListesi=new HashMap<String,Ogrenci>();
private String sinif="";
private String ogrenciNo="";

    public Ogrenci(String sinif, String ogrenciNo) {
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(String adSoyad, String yas, String sinif, String ogrenciNo) {
        super(adSoyad, yas);
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinif='" + sinif + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                "} " + super.toString();
    }

}
