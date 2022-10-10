package j13_Break_Continue.Break;

import java.util.Scanner;

public class T02_IkininKuvveti2 {


    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
    int sayi, k = 0;
        System.out.println("sayi gir");
    sayi = sc.nextInt();

        while (sayi > 1) { //sayi birden küçük olana kadar içeresindeki işlemi yapacak

        if (sayi % 2 == 0) {
            k = 1;
        } else { //eğer kalan bir ise kuvveti değildir.
            k = 2;
            break; //cıksın sistemi yormasın tekrar tekrar
        }
        sayi = (sayi / 2);
    }
        if (1 == k) {
        System.out.println("evet");

    } else {
        System.out.println("hayır");
    }

    }
}
