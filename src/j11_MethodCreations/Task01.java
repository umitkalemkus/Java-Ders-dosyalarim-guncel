package j11_MethodCreations;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sayiyi giriniz");
        int sayi1 = sc.nextInt();

        System.out.println("2. Sayiyi giriniz");
        int sayi2 = sc.nextInt();



        Sayiesitligi(sayi1, sayi2);
        System.out.println(Sayiesitligi2(33, 45));
        System.out.println(Sayiesitligi2(33, 33));
        System.out.println(Sayiesitligi2(33, 49));

    }

    private static boolean Sayiesitligi2(int sayi1, int sayi2) {
        boolean esitMI;
        if (sayi1 == sayi2) {
            esitMI = true;
        }else esitMI=false;


        return esitMI;
    }

    public static void Sayiesitligi(int sayi1, int sayi2) {
        if (sayi1 == sayi2) {
            System.out.println("Bu sayilar birbirine esittir");

        } else {
            System.out.println("Bu sayilar birbirine esit degildir");
        }


    }


}
