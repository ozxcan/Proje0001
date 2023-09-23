package okul_Programi;

import java.util.Scanner;

public class Islemler implements IslemlerInterface {
    static String c_BLUE = "\u001B[34m";
    static String BOLD = "\033[0;1m";
    static String c_RESET = "\u001B[0m";
    static String c_RED = "\u001B[31m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    static Scanner scan = new Scanner(System.in);
    static int secim = 0;

    public static void islemlerMenu(int i) throws InterruptedException {
        secim = i;
        Islemler obj = new Islemler();
        System.out.println(c_PURPLE+BOLD+" Lütfen seciminizi Yapiniz: "+c_RESET);
        System.out.println(c_RED+"     1-Ekleme\n"+"     2-Arama\n"+"     3-Listeleme\n"+"     4-Silme\n"+"     5-AnaMenu\n"+"     6-Cikis "+c_RESET);
        int scm = scan.nextInt();                            //TrcCatch Ekle
        switch (scm) {
            case 1:
                obj.ekleme();
                islemlerMenu(secim);
                break;
            case 2:
                obj.arama();
                islemlerMenu(secim);
                break;
            case 3:
                obj.listeleme();
                islemlerMenu(secim);
                break;
            case 4:
                obj.silme();
                islemlerMenu(secim);
                break;
            case 5:
                obj.anaMenu();
                break;
            case 6:
                obj.cikis();
                islemlerMenu(secim);
                break;
            default:
                System.out.println(BOLD+c_RED+"Lütfen Gecerli bir Giris yapiniz"+c_RESET);
                islemlerMenu(secim);
        }

    }

    @Override
    public void ekleme() throws InterruptedException {
        System.out.println(BOLD+"Kimlik Numarasi giriniz: ");
        String kimlikNo=scan.next();
                   // kimlikIDKontrol(kimlikNo);
        if(Ogrenci.ogrenciListesi.containsKey(kimlikNo)){
            System.out.println("bu kimlik Numarali kisi ogrencimizdir!!! ");
            System.out.println("Islemler Menusune Yönlendiriliyorsunuz !!!");
            Thread.sleep(4000);
        } else if (Ogretmen.ogretmenListesi.containsKey(kimlikNo)){
            System.out.println("bu kimlik Numarali kisi ogretmenimizdir!!! ");
            System.out.println("Islemler Menusune Yönlendiriliyorsunuz !!!");
            Thread.sleep(4000);
        }else{
            BilgiAlKaydet(secim,kimlikNo);
        }

    }

    private void BilgiAlKaydet(int secim, String kimlikNo) {
        Scanner scan = new Scanner(System.in);        System.out.println("Ad ve Soyad giriniz =");
        String adSoyad= scan.nextLine();
        System.out.println(BOLD+"Yas giriniz =");
        String Yas= scan.nextLine();
        if(secim==1){
            System.out.println("Ogrenci numaranizi giriniz ");
            String numara= scan.nextLine();
            System.out.println("Ogrenci sinifini giriniz ");
            String sinif= scan.nextLine();

            Ogrenci ogr= new Ogrenci(adSoyad,Yas,sinif,numara);
            Ogrenci.ogrenciListesi.put(kimlikNo,ogr);
        }else {
            System.out.println("Ogretmen sicil numaranizi giriniz ");
            String Snumara= scan.nextLine();
            System.out.println("Ogretmen bölümünü giriniz ");
            String bolum= scan.nextLine();

            Ogretmen ogrt= new Ogretmen(adSoyad,Yas,Snumara,bolum);
            Ogretmen.ogretmenListesi.put(kimlikNo,ogrt);
        }

    }

    private void kimlikIDKontrol(String kimlikNo) {



    }

    @Override
    public void arama() {
        System.out.println(BOLD+"Aramak istediginiz kisinin kimlik numarasini giriniz: ");
        String kimlikID= scan.next();
        if(Ogretmen.ogretmenListesi.containsKey(kimlikID)){
            System.out.println(Ogretmen.ogretmenListesi.get(kimlikID));
        } else if (Ogrenci.ogrenciListesi.containsKey(kimlikID)) {
            System.out.println(Ogrenci.ogrenciListesi.get(kimlikID));
            
        }else{
            System.out.println("Kayitli degildir");
        }

    }

    @Override
    public void listeleme() {
        if(secim==1){
            System.out.println(Ogrenci.ogrenciListesi);
        }else if (secim==2){
            System.out.println(Ogretmen.ogretmenListesi);
        }

    }

    @Override
    public void silme() {
        System.out.println(BOLD+"Silmek istediginiz kisinin kimlik numarasini giriniz: ");
        String kimlikID= scan.next();
        if(Ogretmen.ogretmenListesi.containsKey(kimlikID)){
            Ogretmen.ogretmenListesi.remove(kimlikID);
        }else if(Ogrenci.ogrenciListesi.containsKey(kimlikID)){
            Ogrenci.ogrenciListesi.remove(kimlikID);
        }else {
            System.out.println(BOLD+"Böyle bir kimlik  numarasi yoktur !!!");
        }

    }

    @Override
    public void anaMenu() throws InterruptedException {
AnaMenu.giris();
    }

    @Override
    public void cikis() throws InterruptedException {
        System.out.println(" GÜLE GÜLE :( ...");
        Thread.sleep(4000);
    }
}
