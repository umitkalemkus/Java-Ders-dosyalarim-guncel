package interviewSorulari;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Bir string ifade giriniz");
         String str = sc.nextLine();
         System.out.println("Bir numara giriniz");
         int number = sc.nextInt();

        System.out.println("ilkSonHarf(str,number) = " + ilkSonHarf(str, number));


    }

    private static String ilkSonHarf(String str , int number ) {

        String ilkvesonhafler = str.substring(0,1)+str.substring(str.length()-1) ;

        System.out.println(ilkvesonhafler);
         String output ="";
        for (int i = 0; i <number ; i++) {
          output+=ilkvesonhafler;
        }


     return output;
    }


}