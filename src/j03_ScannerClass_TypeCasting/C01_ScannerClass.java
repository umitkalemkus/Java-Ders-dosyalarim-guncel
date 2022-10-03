package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass  {

    public static void main(String[] args) {

        // Kullanicidan veri  almak icin uc adim takip ediniz. 1-
        // 1. adim -> Scanner class'san object create edilir.

        Scanner scan = new Scanner(System.in);// Scanner classindan scan isminde degerini System icinden alan bir objedir.

        //2 adim-> Kullanicidan istenen veri icin bildirimde bulunur->sout("...");

        System.out.println(" adinizi giriniz");
        //3 adim-> Kullanicinin girdigi veri data typene gore bir variable atanir.

        String isim = scan.nextLine();//kullanicidan gelen string tipinde isim verisi scan obj'ni nextline() methodu ile atandi.
        System.out.println("isim = " + isim);
         // Task-> Kullanicinin girdigi degere gore kare alani ve cevresini hesaplayan bir code create ediniz.


        System.out.print("karenin kenarini giriniz :");
        int kenar = scan.nextInt();
        System.out.println("alan = " + (kenar*kenar)+"cevre = "+(kenar*4));






    }




}
