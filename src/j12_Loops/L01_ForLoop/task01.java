package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
       		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
       		- Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

        Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = sc.nextInt();

        if(sayi>=100){
            System.out.println("Hatali giris yaptiniz");
        }else {
            for (int i = 1; i <sayi ; i++) {

                if(i%3==0 && i%4==0){
                    System.out.println("JavaCan");
                    
                } else if ( i%3==0 ) {
                    System.out.println("Java");
                } else if (i%5==0) {
                    System.out.println("CAN");

                }else {
                    System.out.println(i);
                }

            }

        }




















    }






}
