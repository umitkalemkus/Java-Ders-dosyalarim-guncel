package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */


        Scanner scan = new Scanner (System.in);
        System.out.println("Bir Banka Hesabınız Var mı ?");
        boolean Banka = scan.hasNextBoolean();
        System.out.println("Banka = " + Banka);


    }
}
