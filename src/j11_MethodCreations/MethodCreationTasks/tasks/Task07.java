package j11_MethodCreations.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = sc.nextInt();


        System.out.println(" Ikinci sayiyi giriniz");
        int sayi2 = sc.nextInt();


        System.out.println(" Ucuncu sayiyi giriniz");
        int sayi3 = sc.nextInt();

         kucuksayibulma(sayi1,sayi2,sayi3);


    }

    public static void kucuksayibulma(int sayi1 , int sayi2 , int sayi3) {
      if (sayi1 > sayi2 && sayi2 > sayi3){
          System.out.println("en kucuk sayi = " + sayi3);
      }else if (sayi3 > sayi1 && sayi2 > sayi1){
          System.out.println("en kucuk sayi = " + sayi1);

      } else if (sayi2 > sayi1 && sayi1 > sayi3) {
          System.out.println("en kucuk sayi = " + sayi2);

      }else {
          System.out.println("Yanlis bir sayi girdiniz");

      }

    }


}

