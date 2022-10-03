package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c05_NestedTernaryOperator {

    public static void main(String[] args) {
/*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

         Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi =sc.nextInt();


        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif sayi") : "Negatif sayi");


    }









}
