package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c03_TernaryOperator {
    public static void main(String[] args) {
       /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.

        */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= sc.nextInt();


                                   System.out.println("  **** Ternary  *********     ");

    System.out.println(sayi % 2 == 0 ? "Bu sayi cift bir sayidir" : "Bu sayi tek bir sayidir");

     /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */



    }








}
