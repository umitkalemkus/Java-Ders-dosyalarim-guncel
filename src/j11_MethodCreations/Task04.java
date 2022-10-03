package j11_MethodCreations;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        double sayi1 = sc.nextDouble();

        System.out.println("2. sayiyi giriniz");
        double sayi2 = sc.nextDouble();

        System.out.println("Isleminizi seciniz");
        String islem = sc.next();

        switch (islem){
            case "toplama":
                System.out.println(sayi1+sayi2);
                break;
            case "cikarma":
                System.out.println(sayi1-sayi2);
                break;
            case "carpma":
                System.out.println(sayi1*sayi2);
                break;
            case "bolme":
                System.out.println(sayi1/sayi2);
                break;
            default:System.out.println("lütfen doğru giriş yapınız :( ");


        }

    }



}
