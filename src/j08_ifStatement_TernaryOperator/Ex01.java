package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        //Task01
        //girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = sc.nextInt();
        int not = sc.nextInt();

        //if (sayi > 0) {
        // System.out.println("Sayi pozitiftir");
        //} else if (sayi < 0) {
        // System.out.println("Sayi negatiftir");
        //} else {
        //System.out.println("Sayi sifirdir");

        if (sayi > 80) {
            System.out.println("A");
        } else if (sayi < 80 && sayi > 60) {
            System.out.println("B");
        } else if (sayi <= 60 && sayi > 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }


    }
}