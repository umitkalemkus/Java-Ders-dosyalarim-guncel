package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c05_TernaryOperator {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= sc.nextInt();
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz


        System.out.println(sayi % 2 == 0 ? sayi / 2 : "Sayi tek oldugu icin yarisi tam sayi degildir.");

        /*
        ahan da TRICK -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...
           */




    }











}
