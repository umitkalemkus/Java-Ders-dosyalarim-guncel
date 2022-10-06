package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {


        // task -> girilen sayıdan 100 e kadar 4un katı tamsayıları print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = sc.nextInt();


        if (sayi > 100) {
            System.out.println("Hatali giris yaptiniz");

        } else {
            for (int i = sayi ; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.println(i + " ");

                }

            }


        }


    }
}