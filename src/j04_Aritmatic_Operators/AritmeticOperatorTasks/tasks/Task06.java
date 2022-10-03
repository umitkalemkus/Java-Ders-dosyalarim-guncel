package j04_Aritmatic_Operators.AritmeticOperatorTasks.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz : ");

        int sayi = scan.nextInt();

        // 1 ler basamagi -> bir sayinin 10 bolumunden kalan 1 ler basamagidir.

           int birler = sayi%10 ;  // sayinin birler basamagi  853 10 a bolecegim bolumu alacagim.
            sayi  /=10; // sayi 10 bolumunden bolumu verir 853/10-> 85
            int onlar  = sayi%10; // 85in 10 bolumunden kalan-> 5
             int yuzler = sayi/10; // 85 in 10 a bolumunu verir->8

        System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
                +"\nGirdiginiz sayinin yuzler basamagi :"+yuzler);







    }
}
