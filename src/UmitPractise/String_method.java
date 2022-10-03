package UmitPractise;

public class String_method {

    public static void main(String[] args) {

        String diller = "   ingilizce , fransizca, ispanyolca , turkce   ";

        System.out.println(diller.contains("ingilizce"));
        System.out.println(diller.contains("arapca"));
        System.out.println(diller.trim());
        System.out.println(diller.charAt(22));
        System.out.println(diller.replace("ingilizce","arapca"));


        String bilgi = "Ben Javayi sevmiyorum";
        //System.out.println(bilgi.replace("sevmiyorum","seviyorum"));
        System.out.println(bilgi.replace(" ", ""));




        String isim1 ="Ahmet";
        String isim2 = "Mehmet";
        System.out.println(isim1.compareTo(isim2));














    }











}
