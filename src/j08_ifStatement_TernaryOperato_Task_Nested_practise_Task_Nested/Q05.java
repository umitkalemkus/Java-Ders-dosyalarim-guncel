package j08_ifStatement_TernaryOperato_Task_Nested_practise_Task_Nested;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Yasiniz Giriniz");
        int yas = sc.nextInt();
        System.out.println("Kilonuzu giriniz");
        double kilo = sc.nextDouble();


        if (yas > 18) {
            if (kilo > 50) {
                System.out.println("Kan bagisi yapabilir");}
            else{
                    System.out.println("Kan bagisi yapabilir");
                }
            } else {
                System.out.println("18 yasindan kucuk ise kan bagisi yapamaz");

            }

        }
    }
