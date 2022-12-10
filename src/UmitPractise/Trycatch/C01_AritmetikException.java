package UmitPractise.Trycatch;

import java.util.Scanner;

public class C01_AritmetikException {
    public static void main(String[] args) {

        String str ="";
       // str.charAt(2);


        Scanner sc  = new Scanner(System.in);
        System.out.println("Birici sayi giriniz");
        int sayi1 = sc.nextInt();
        System.out.println("Ikinci sayi giriniz");
        int sayi2 = sc.nextInt();


        //int oran =sayi1/sayi2;


        try {
            int oran =sayi1/sayi2;
            System.out.println(oran);

        }catch (ArithmeticException e){
            System.out.println("0'a bolemezsiniz");
        }finally {
            System.out.println("Basardin");
        }

        System.out.println("Program aktif");












    }
}
