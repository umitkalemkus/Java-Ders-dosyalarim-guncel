package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C3_Forloopsexample6 {
    public static void main(String[] args) {

         /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       5x5
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut = sc.nextInt();


        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut ; j++) {

                System.out.print(i * j+" ");
            }
            System.out.println();
        }









    }


}
