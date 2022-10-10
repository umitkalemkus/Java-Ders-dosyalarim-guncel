package j13_Break_Continue.Break;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner sc=new  Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int number=sc.nextInt();

        System.out.println(PowersofTwo(number));


    }

    private static boolean PowersofTwo(int a ) {
         boolean ikikuvvet= true;

        for (int i = 2; i <a ; i*=2) {
            if(a % i !=0){
                ikikuvvet=false;
            }
            
        }
        return ikikuvvet;
    }
}

