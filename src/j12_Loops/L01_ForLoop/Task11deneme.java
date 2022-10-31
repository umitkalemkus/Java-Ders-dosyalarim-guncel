package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class Task11deneme {

     /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler

         */
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Bir ifade giriniz");
         String str =sc.nextLine();
        polidrome(str);













     }

    private static void polidrome(String str) {


        String cumle ="";
        for (int i = str.length()-1; i >=0 ; i--) {


            cumle+=str.charAt(i);

        }
        System.out.println(cumle);
    }


}
