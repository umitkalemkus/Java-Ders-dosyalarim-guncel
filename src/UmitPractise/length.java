package UmitPractise;

public class length {

    public static void main(String[] args) {

         String isim = "Umit";
         String dil = "Java";
         String bilgi = "String uzunlugu elde etme";


        System.out.println(isim.length());
        int isimUzunlugu =isim.length();
        System.out.println("isimUzunlugu = " + isimUzunlugu);
        int dilUzunlugu = dil.length();
        int bilgiUzunlugu = bilgi.length();
        System.out.println("dilUzunlugu = " + dilUzunlugu);
        System.out.println("bilgiUzunlugu = " + bilgiUzunlugu);


        String isim1 = "hamza";
        String isim2 = "HAMZA";

        boolean esitmi= isim1.equalsIgnoreCase(isim2);
        System.out.println(esitmi);

        String bilgi1 = "sampiyon galatasaray";
        System.out.println("bilgi1 = " + bilgi1.toLowerCase());
        System.out.println("bilgi1 = " + bilgi1.toUpperCase());



                
                
                

    }






}
