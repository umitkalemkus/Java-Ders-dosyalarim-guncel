package day6;

import java.util.Scanner;

public class Q05_ForLoop {
    public static void main(String[] args) {
         /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazın
        Örnek Ekran Çıktısı
        Girilen sayı=4               1 -> 1  2-> 4  3->9  4-> 16
        Kareler toplamı=14
         */

            Scanner sc = new Scanner(System.in);
            System.out.print("1 den buyuk bir tamsayi giriniz :");
            int sayi = sc.nextInt();
            int kareToplam = 0 ;
            for (int i = 1; i < sayi; i++) {  // 1   2   3
                kareToplam += i*i;            // 1   5   14
            }
            System.out.println("kare toplam : " + kareToplam);
        }







    }

