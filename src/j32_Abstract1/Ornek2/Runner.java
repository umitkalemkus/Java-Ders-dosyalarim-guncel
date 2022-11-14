package j32_Abstract1.Ornek2;

public class Runner {
    public static void main(String[] args) {

        Dikdortgen dd =new Dikdortgen(24,10);
        dd.setName("DIKDORTGEN");
        dd.cevreHesapla();
        dd.alanHesapla();
        System.out.println(dd);
        dd.ciz();

        Cember c1 =new Cember(5);
        c1.setName("Cember");
        System.out.println( c1);







    }








}
