package j11_MethodCreations;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        double sayi1 = sc.nextDouble();

        System.out.println("2. sayiyi giriniz");
        double sayi2 = sc.nextDouble();

        System.out.println("Isleminizi seciniz");
         char islem = sc.next().charAt(0);
        islemMenu(islem, (int) sayi1, (int) sayi2);

    }//main sonu
    public static void islemMenu(char ch, int x , int y){
        switch (ch){
            case '+':
                topla(x ,y);
                break;
            case '-':
                carp(x,y);
                break;
            case '*':
                cikar(x,y);
                break;
            case '/':
                bol(x,y);
                break;
            default:
                System.out.println("Hatali islem yaptiniz");




        }






    }


    public static void topla(int a , int b){
        System.out.println("a+b = " + (a + b));
    }
    public static void carp(int a , int b){
        System.out.println("a+b = " + (a * b));
    }public static void cikar(int a , int b){
        System.out.println("a+b = " + (a - b));
    }public static void bol(int a , int b){
        System.out.println("a+b = " + (a / b));
    }




}
