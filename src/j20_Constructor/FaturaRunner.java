package j20_Constructor;

public class FaturaRunner {
    public static void main(String[] args) {

        MüsteriClass M1 = new MüsteriClass("umit");
        System.out.println("M1.name = " + M1.name);


        ElektirikHesap Hesap1 = new ElektirikHesap(1000,0);
         Hesap1.TuketimEkle(300);
         Hesap1.TuketimEkle(400);
        System.out.println("Hesap1.odenecekTutar() = " + Hesap1.odenecekTutar());


    }


}
