package okul_Programi;

import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi{
    static Map<String,Ogretmen> ogretmenListesi=new HashMap<String,Ogretmen>();
    private String bolumu ="";
    private String sicilNo="";

    public Ogretmen(String bolumu, String sicilNo) {
        this.bolumu = bolumu;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String adSoyad, String yas, String bolumu, String sicilNo) {
        super(adSoyad, yas);
        this.bolumu = bolumu;
        this.sicilNo = sicilNo;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolumu='" + bolumu + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
    }
}
