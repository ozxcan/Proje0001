package okul_Programi;

import java.util.Scanner;

import static okul_Programi.Islemler.*;

public class AnaMenu implements AnaMenuInterface{
static Scanner scan=new Scanner(System.in);
    public static void giris() throws InterruptedException {
        AnaMenu object=new AnaMenu();
        System.out.println(BOLD+c_RED+"     =============="+c_RESET);
        System.out.println(c_GREEN+BOLD+"     OKUL YÖNETIMI"+c_RESET);
        System.out.println(BOLD+c_RED+"     =============="+c_RESET);
        System.out.println(c_GREEN+BOLD+"==> lütfen seciminizi yapiniz <==");
        System.out.println("1- Ögrenci Islemleri \n2- Ögretmen Islmeleri\n3- Cikis"+c_RESET);

        String secim=scan.next();
        switch (secim){
            case "1"  :
                object.ogrenciIslemleri();break;
                case "2" :
                    object.ogretmenIslemleri();break;
                    case "3" :
                        object.cikis();break;
            default:
                            System.out.println("Lütfen Gecerli giris yapiniz!!!");
                            giris();
        }

    }
    @Override
    public void ogrenciIslemleri() throws InterruptedException {
        Islemler.islemlerMenu(1);
    }

    @Override
    public void ogretmenIslemleri() throws InterruptedException {
        Islemler.islemlerMenu(2);
    }

    @Override
    public void cikis() {

    }
}
