package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C03_Forloopsexample {

    public static void main(String[] args) {

         /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi1 = sc.nextInt();


        System.out.println("Bir sayi giriniz");
        int sayi2 = sc.nextInt();

        if(sayi1<sayi2)
        {
            for (int i = sayi1; i <sayi2 ; i++) {
                if (i%2==0){
                    System.out.println(i);
                }

            }


        }else System.out.println("Hatali giris yaptniz");









    }







}
