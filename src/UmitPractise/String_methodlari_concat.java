package UmitPractise;

public class String_methodlari_concat {
    public static void main(String[] args) {

        String isim = "Kerem";
        String soyIsim = "Kartal";


        String adSoyad =isim.concat(soyIsim);
        System.out.println(adSoyad);

        String isim1 = "Umit";
        String soyisim2 = "Kalemkus";
        String bosluk = "    ";

        String adsoyad1 = isim1.concat(bosluk).concat(soyisim2);
        System.out.println(adsoyad1);

















   /*
        String isim = "Kerem";
        String soyIsim = "Kartal";

        System.out.println(isim);
        System.out.println(soyIsim);

        String adSoyad = isim+" " +soyIsim;
        System.out.println(adSoyad);
        System.out.println(adSoyad.length());


        String bilgi = "benim ismim  " +isim + "ve soy ismim "+ soyIsim;
        String soyisim_bilgi = "Soy isim = "+ soyIsim;
        System.out.println(soyisim_bilgi);


           */




    }




}
