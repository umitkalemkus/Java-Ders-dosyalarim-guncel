package day11;

public class Varargs01 {

    public static void main(String[] args) {

        SayilarinToplami(5,9,-12,0,100,8);







    }

    private static void SayilarinToplami(int ...sayi) {

        int toplam = 0;
        for (int each:sayi) {
            toplam+=each;

        }

        System.out.println(toplam);
    }


}
