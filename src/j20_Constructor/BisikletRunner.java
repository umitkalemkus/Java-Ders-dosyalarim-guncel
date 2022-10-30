package j20_Constructor;

import java.util.Scanner;

public class BisikletRunner {
    public static void main(String[] args) {
        Bisiklet bisiklet1 = new Bisiklet();
        Scanner sc = new Scanner(System.in);
        int secim=0;
        do {
            bisiklet1.MenuYaz();
            secim=sc.nextInt();
            bisiklet1.IslemYap(bisiklet1,secim);


        }while(secim<5);

    }
}
