package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C03_Forloopexample9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayi giriniz");
        int toplam= 0;


        for (int i = 1; i <5 ; i++) {
            System.out.print(i + ". sayiyi giriniz");
            int sayi =sc.nextInt();
            if (sayi<=10 || sayi>=20)
            {
                toplam+=sayi;
            }

            System.out.print(toplam);
        }

    }






}
