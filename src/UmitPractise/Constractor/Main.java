package UmitPractise.Constractor;

public class Main {
    public static void main(String[] args) {

        Araba arb =new Araba();
        System.out.println("arb.motor = " + arb.motor);
        System.out.println("arb.hiz = " + arb.hiz);
        System.out.println("arb.model = " + arb.model);
        Araba.marka();


        Araba arb1 =new Araba(100,"otomatik",3);
        System.out.println("arb1.hiz = " + arb1.hiz);
        System.out.println("arb1.vites = " + arb1.vites);


    }
}
