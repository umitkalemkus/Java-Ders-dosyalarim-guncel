package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */

        Scanner scan = new Scanner (System.in);
        System.out.println("Isminizi giriniz :");
        String isim =scan.nextLine();
        System.out.println("isim = " + isim);


      float a = 5.00f;
      float b = 3.45f;
        System.out.println(a-b);

    }
}
