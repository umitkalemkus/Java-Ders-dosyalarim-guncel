package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c04_TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= sc.nextInt();

        // TASK-> girilen  bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        System.out.println(sayi > 9 || sayi<-9? "Sayi iki yada daha fazla basamakli" : "Sayi tek basamakli");
        System.out.println(1999);

    }








}
