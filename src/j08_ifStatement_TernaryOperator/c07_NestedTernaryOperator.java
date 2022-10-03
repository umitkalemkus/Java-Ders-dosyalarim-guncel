package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c07_NestedTernaryOperator {

    public static void main(String[] args) {


  /*
        TASK :
         Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı” print eden
         4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “4 basamaklı olmayan tek sayı yazdırın.”

         */

        Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=sc.nextInt();


        System.out.println((sayi > 999 && sayi < 10000) ? "4 basamakli" : sayi % 2 == 0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı .");


    }




}
