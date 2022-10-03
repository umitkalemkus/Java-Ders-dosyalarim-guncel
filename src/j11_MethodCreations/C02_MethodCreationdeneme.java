package j11_MethodCreations;

import java.util.Scanner;

public class C02_MethodCreationdeneme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. notu giriniz");
        double a = sc.nextDouble();


        System.out.println("2. notu giriniz");
        double b = sc.nextDouble();

        System.out.println("3. notu giriniz");
        double c = sc.nextDouble();


        double Ortalamaniz = (ortalamaHesapla(a, b, c));
        System.out.println("Ortalamaniz = " + Ortalamaniz);


    }

    private static double ortalamaHesapla(double a , double b , double c) {


        return (a+b+c)/3;
    }


}
