package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C3_Forloopsexample5 {
    public static void main(String[] args) {
         /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = sc.nextInt();


        for (int i = 1; i <=sayi ; i++) {

            for (int j = 1; j <=sayi ; j++) {


                if(i==j){
                    System.out.print("1");}
                else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }











    }






}
